/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SecurityTier1Employee;

import Business.Branch.Branch;
import Business.Business;
import Business.Department.Department;
import Business.Region.Region;
import Business.UserAccount.UserAccount;
import UserInterface.LoanEmployee.LoanRequestsProcessedByHim;
import UserInterface.LoanEmployee.OpenRequestsJPanel;
import UserInterface.LoanEmployee.UpdatePersonProfileLoanEmpJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class SecurityTier1EmployeeWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Region region;
    private Branch branch;
    private Department department;
    private Business business;
    
    public SecurityTier1EmployeeWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,Region region,Branch branch,Department department,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.region = region;
        this.branch = branch;
        this.department = department;
        this.business = business;
        
        lblUserName.setText(String.valueOf(userAccount.getPerson()));
        lblUserRole.setText(this.userAccount.getRole().getRoleType());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewLog = new javax.swing.JButton();
        btnUpdatePersonalProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnWorkRequests = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblUserRole = new javax.swing.JLabel();

        btnViewLog.setText("View Log");
        btnViewLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLogActionPerformed(evt);
            }
        });

        btnUpdatePersonalProfile.setText("View Personal Profile");
        btnUpdatePersonalProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonalProfileActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setText("Welcome ");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblRole.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        btnWorkRequests.setText("His Work Requests ");
        btnWorkRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkRequestsActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        lblUserName.setText("jLabel2");

        lblUserRole.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        lblUserRole.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnViewLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdatePersonalProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnWorkRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblName)
                    .addComponent(lblUserName))
                .addGap(11, 11, 11)
                .addComponent(lblUserRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole)
                .addGap(81, 81, 81)
                .addComponent(btnViewLog)
                .addGap(42, 42, 42)
                .addComponent(btnWorkRequests)
                .addGap(41, 41, 41)
                .addComponent(btnUpdatePersonalProfile)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLogActionPerformed
        ViewLogJPanel log = new ViewLogJPanel(userProcessContainer,userAccount,region,branch,department,business);
        userProcessContainer.add("ViewLogJPanel",log);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewLogActionPerformed

    private void btnUpdatePersonalProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonalProfileActionPerformed
        ViewPersonalProfileTier1JPanel updatePersonalProfile = new ViewPersonalProfileTier1JPanel(userProcessContainer,userAccount);
        userProcessContainer.add("ViewPersonalProfileTier1JPanel",updatePersonalProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdatePersonalProfileActionPerformed

    private void btnWorkRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkRequestsActionPerformed
        HisWorkRequestsJPanel workRequests = new HisWorkRequestsJPanel(userProcessContainer,userAccount);
        userProcessContainer.add("HisWorkRequestsJPanel",workRequests);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkRequestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdatePersonalProfile;
    private javax.swing.JButton btnViewLog;
    private javax.swing.JButton btnWorkRequests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserRole;
    // End of variables declaration//GEN-END:variables
}