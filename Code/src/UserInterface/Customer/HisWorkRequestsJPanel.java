/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.CashierChequeWorkRequest;
import Business.WorkQueue.CreditWorkRequest;
import Business.WorkQueue.DebitWorkRequest;
import Business.WorkQueue.LoanWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kurki
 */
public class HisWorkRequestsJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    
    public HisWorkRequestsJPanel(JPanel userProcessContainer,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount =userAccount;
        
        populateTable();
        
    }

    private void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblRequests.getModel();
        dtm.setRowCount(0);
   
               if(!userAccount.getWorkQueue().getWorkRequestList().isEmpty())
               {
                    for (WorkRequest w : userAccount.getWorkQueue().getWorkRequestList())
                    {
                                    Object[] row = new Object[4];
                                    
                                    if(w instanceof CreditWorkRequest)
                                        {
                                            row[0]= w;
                                            row[1]= ((CreditWorkRequest) w).getCreditAmount();
                                            row[2]= "Credit";
                                        }
                                    else if (w instanceof DebitWorkRequest)
                                        {
                                            row[0]= w;
                                            row[1]= ((DebitWorkRequest) w).getDebitAmount();
                                            row[2]= "Debit";
                                        }
                                    else if (w instanceof CashierChequeWorkRequest)
                                        {
                                            row[0]= w;
                                            row[1]= ((CashierChequeWorkRequest) w).getAmount();
                                            row[2]= "Cashier Check";
                                        }
                                    else if(w instanceof LoanWorkRequest)
                                        {
                                            row[0]= w;
                                            row[1]= ((LoanWorkRequest) w).getCustomeRrequestedLoanAmount();
                                            row[2]= "Loan Request";
                                        }
                                    
                                    row[3]= w.getStatus();
                                    dtm.addRow(row);

                    }
               }
        else
               {
                   btnViewDetails.setEnabled(false);
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

        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText(" Customer's Work Requests ");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Amount", "Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequests);

        btnViewDetails.setText("View  Request Details >>");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btnViewDetails)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnViewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        int rowSelected = tblRequests.getSelectedRow();

        if (rowSelected < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row.","WARNING",JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest workRequest = (WorkRequest) tblRequests.getValueAt(rowSelected, 0);
        
            RequestDetailsJPanel requestDetails = new RequestDetailsJPanel(userProcessContainer,workRequest,userAccount);
            userProcessContainer.add("RequestDetailsJPanel",requestDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables
}