/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerServiceEmployee;

import Business.Branch.Branch;
import Business.Customer.Customer;
import Business.Department.Department;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CashierChequeWorkRequest;
import Business.WorkQueue.CreditWorkRequest;
import Business.WorkQueue.DebitWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kurki
 */
public class OpenRequestsCustomerEmpJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private Branch branch;
   private Department department;
   private UserAccount userAccount;
    
    public OpenRequestsCustomerEmpJPanel(JPanel userProcessContainer,Branch branch,Department department,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.branch = branch;
        this.department =department;
        this.userAccount = userAccount;
   
        populateTable();
        
    }
    
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblRequests.getModel();
        dtm.setRowCount(0);
   
               if(!department.getWorkQueue().getWorkRequestList().isEmpty())
               {
                    for (WorkRequest w : department.getWorkQueue().getWorkRequestList())
                    {
                        if((w.getStatus().equals("Open")) && (w.getReceiver()==null))
                        {
                                    Object[] row = new Object[5];
                                    
                                    row[1]= (Customer) w.getSender().getPerson();
                                    if(w instanceof CreditWorkRequest)
                                        {
                                            row[0]= w;
                                            row[2]= ((CreditWorkRequest) w).getCreditAmount();
                                            row[3]= "Credit";
                                        }
                                    else if (w instanceof DebitWorkRequest)
                                        {
                                            row[0]= w;
                                            row[2]= ((DebitWorkRequest) w).getDebitAmount();
                                            row[3]= "Debit";
                                        }
                                    else if (w instanceof CashierChequeWorkRequest)
                                        {
                                            row[0]= w;
                                            row[2]= ((CashierChequeWorkRequest) w).getAmount();
                                            row[3]= "Cashier Check";
                                        }
                                    row[4]= w.getStatus();
                                    dtm.addRow(row);
                                
                                
                            
                        }
                        
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

        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Open Requests");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign to Himself");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Customer", "Amount", "Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequests);

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
                        .addGap(273, 273, 273)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnAssign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int rowSelected = tblRequests.getSelectedRow();

        if (rowSelected < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row.","WARNING",JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest workRequest = (WorkRequest) tblRequests.getValueAt(rowSelected, 0);

         
         
        // Setting the employee in the work request of employee
          workRequest.setReceiver(userAccount);
          userAccount.getWorkQueue().getWorkRequestList().add(workRequest);

        // Setting the employee in the work request of customer requested
        for(UserAccount ua:branch.getUserAccountDirectory().getUserAccountList())
        {
            if(ua.getPerson()==workRequest.getSender().getPerson())
            {
                for(WorkRequest wr : ua.getWorkQueue().getWorkRequestList())
                {
                        if(wr==workRequest)
                        {
                            wr.setReceiver(userAccount); ;
                        }
                    
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Work Request is assigned to oneself successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);

        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables
}
