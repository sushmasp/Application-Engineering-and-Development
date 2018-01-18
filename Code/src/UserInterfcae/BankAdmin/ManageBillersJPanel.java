/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfcae.BankAdmin;

import Business.Account.Account;
import Business.Biller.Biller;
import Business.Business;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kurki
 */
public class ManageBillersJPanel extends javax.swing.JPanel {

 
    private JPanel userProcessContainer;
    private Business business;
    
    public ManageBillersJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business; 
        populateTable();
    }
    
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblBillers.getModel();
        dtm.setRowCount(0);
        Account account=null;
        
        if(!(business.getBillerDirectory().getBillerList().isEmpty()))
        {
            for(Biller biller : business.getBillerDirectory().getBillerList())
            {
                Object[] row = new Object[2];
                row[0]= biller;
                ArrayList<Account> accounts= new ArrayList<Account>();
                accounts = biller.getAccountDirectory().getAccountList();
                for(Account a:accounts)
                {
                    if(a.getAccountName().equals(Account.AccountType.CheckingAccount.getValue()))
                    {
                        account = a;
                    }
                }
                row[1] = account;
                dtm.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBillers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNewBiller = new javax.swing.JButton();
        btnRemoveBiller = new javax.swing.JButton();

        tblBillers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Biller Name", "Account Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBillers);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Manage Billers");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update >>");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnNewBiller.setText("Add new Biller >>");
        btnNewBiller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBillerActionPerformed(evt);
            }
        });

        btnRemoveBiller.setText("Remove Biller");
        btnRemoveBiller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveBillerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnUpdate)
                        .addGap(44, 44, 44)
                        .addComponent(btnRemoveBiller)
                        .addGap(49, 49, 49)
                        .addComponent(btnNewBiller))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack)))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnNewBiller)
                    .addComponent(btnRemoveBiller))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNewBillerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBillerActionPerformed
        NewBillerJPanel newBiller = new NewBillerJPanel(userProcessContainer,business);
        userProcessContainer.add("NewBillerJPanel",newBiller);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnNewBillerActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
      int rowSelected = tblBillers.getSelectedRow();
      
      if (rowSelected < 0)
      {
          JOptionPane.showMessageDialog(null, "Please select a biller.","WARNING",JOptionPane.WARNING_MESSAGE);
          return;
      }
      
      Biller biller = (Biller)tblBillers.getValueAt(rowSelected, 0);
      
        UpdateBillerJPanel updateBiller = new UpdateBillerJPanel(userProcessContainer,biller);
        userProcessContainer.add("UpdateBillerJPanel",updateBiller);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveBillerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveBillerActionPerformed
      int rowSelected = tblBillers.getSelectedRow();
      
      if (rowSelected < 0)
      {
          JOptionPane.showMessageDialog(null, "Please select a biller.","WARNING",JOptionPane.WARNING_MESSAGE);
          return;
      }
      
      Biller biller = (Biller)tblBillers.getValueAt(rowSelected, 0);
      
      business.getBillerDirectory().removeBiller(biller);
      
      JOptionPane.showMessageDialog(null, "Biller is removed from the list successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
      
      populateTable();
      
    }//GEN-LAST:event_btnRemoveBillerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNewBiller;
    private javax.swing.JButton btnRemoveBiller;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBillers;
    // End of variables declaration//GEN-END:variables
}
