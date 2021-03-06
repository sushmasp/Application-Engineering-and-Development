/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BranchManager;

import Business.Branch.Branch;
import Business.Department.Department;
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
public class SecurityRequestsJPanel extends javax.swing.JPanel {
   
   private JPanel userProcessContainer;
   private Branch branch;
   private UserAccount userAccount;
   private Department department =null;
    
    public SecurityRequestsJPanel(JPanel userProcessContainer,Branch branch,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.branch = branch;
        this.userAccount = userAccount;

        populateTable();
   
    }

    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblRequests.getModel();
        dtm.setRowCount(0);
        if(!branch.getDepartmentDirectory().getDepartmentList().isEmpty())
        {
            for(Department dept:branch.getDepartmentDirectory().getDepartmentList())
            {
                if(dept.getDepartmentName().equals(Department.DepartmentType.SecurityDepartment.getValue()))
                {
                    department = dept;
                }
            }
           if(department==null)
           {
               return;
           }
           else
           {
               if(!department.getWorkQueue().getWorkRequestList().isEmpty())
               {
                    for (WorkRequest w : department.getWorkQueue().getWorkRequestList())
                    {
                        if(w.getStatus().equals("Notify Manager"))
                        {
                            if(w instanceof SecurityWorkRequest)
                            {
                                    Object[] row = new Object[3];
                                    row[0]= w;
                                    row[1]= w.getResolveDate();
                                    row[2] = w.getStatus();
                                    dtm.addRow(row);
                              
                            }
                        }

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

        btnBack = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();

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
                "Security Request ID", "Notified Date", "Status"
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText(" Security Requests ");

        btnViewDetails.setText("View Request Details >>");
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
                        .addGap(25, 25, 25)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnViewDetails)
                .addGap(114, 114, 114)
                .addComponent(btnBack)
                .addContainerGap(29, Short.MAX_VALUE))
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
            SecurityDetailsJPanel securityDetails = new SecurityDetailsJPanel(userProcessContainer,((SecurityWorkRequest) w),branch,department,userAccount);
            userProcessContainer.add("SecurityDetailsJPanel",securityDetails);
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
