/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SecurityTier2Employee;

import Business.Branch.Branch;
import Business.Department.Department;
import Business.Log;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SecurityWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kurki
 */
public class ProcessedByHimJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Department department;
    private Branch branch;
    
    public ProcessedByHimJPanel(JPanel userProcessContainer,UserAccount userAccount,Department department,Branch branch) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount =userAccount;
        this.department = department;
        this.branch = branch;
        populateTable();
        
    }
    
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblRequests.getModel();
        dtm.setRowCount(0);
   
               if(!userAccount.getWorkQueue().getWorkRequestList().isEmpty())
               {
                    for (WorkRequest w : userAccount.getWorkQueue().getWorkRequestList())
                    {
                        if((w.getReceiver()==userAccount))
                        {
                            if(w instanceof SecurityWorkRequest)
                            {
                                    Object[] row = new Object[3];
                                    row[0]= w;
                                    row[1]= w.getRequestDate();
                                    row[2] = w.getStatus();
                                    dtm.addRow(row);
                              
                            }
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
        btnViewDetails = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText(" Security Requests Processed By Onself");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewDetails.setText("View Request Details >>");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Security Request ID", "Requested Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblRequests);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnViewDetails)
                .addGap(144, 144, 144)
                .addComponent(btnBack)
                .addContainerGap(31, Short.MAX_VALUE))
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
        WorkRequest w = (WorkRequest) tblRequests.getValueAt(rowSelected, 0);
        
        if(w instanceof SecurityWorkRequest)
        {
            ViewRequestDetailsJPanel viewLoanDetails = new ViewRequestDetailsJPanel(userProcessContainer,((SecurityWorkRequest) w),branch,department,userAccount);
            userProcessContainer.add("ViewRequestDetailsJPanel",viewLoanDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
       
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables
}
