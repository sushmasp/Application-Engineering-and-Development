/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SecurityTier2Employee;

import Business.Branch.Branch;
import Business.Business;
import Business.Department.Department;
import Business.Region.Region;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class SecurityTier2EmployeeWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Region region;
    private Branch branch;
    private Department department;
    private Business business;
    
    public SecurityTier2EmployeeWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,Region region,Branch branch,Department department,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.region = region;
        this.branch = branch;
        this.department = department;
        this.business = business;
        
        lblName.setText(String.valueOf(userAccount.getPerson()));
        lblRole.setText(this.userAccount.getRole().getRoleType());
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProcessedByHim = new javax.swing.JButton();
        btnUpdatePersonalProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnOpenRequests = new javax.swing.JButton();

        btnProcessedByHim.setText("Security Requests Processed By Him");
        btnProcessedByHim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessedByHimActionPerformed(evt);
            }
        });

        btnUpdatePersonalProfile.setText("View Personal Profile");
        btnUpdatePersonalProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonalProfileActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Welcome ");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblRole.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        btnOpenRequests.setText("Open Security Requests");
        btnOpenRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenRequestsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnOpenRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(235, 235, 235)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnUpdatePersonalProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProcessedByHim, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRole)
                .addGap(65, 65, 65)
                .addComponent(btnOpenRequests)
                .addGap(40, 40, 40)
                .addComponent(btnProcessedByHim)
                .addGap(47, 47, 47)
                .addComponent(btnUpdatePersonalProfile)
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessedByHimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessedByHimActionPerformed
        ProcessedByHimJPanel requests = new ProcessedByHimJPanel(userProcessContainer,userAccount,department,branch);
        userProcessContainer.add("ProcessedByHimJPanel",requests);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessedByHimActionPerformed

    private void btnUpdatePersonalProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonalProfileActionPerformed
        ViewPersonalProfileTier2JPanel updatePersonalProfile = new ViewPersonalProfileTier2JPanel(userProcessContainer,userAccount);
        userProcessContainer.add("ViewPersonalProfileTier2JPanel",updatePersonalProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdatePersonalProfileActionPerformed

    private void btnOpenRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenRequestsActionPerformed
        OpenRequestsJPanel openRequests = new OpenRequestsJPanel(userProcessContainer,userAccount,department,branch);
        userProcessContainer.add("OpenRequestsJPanel",openRequests);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOpenRequestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpenRequests;
    private javax.swing.JButton btnProcessedByHim;
    private javax.swing.JButton btnUpdatePersonalProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    // End of variables declaration//GEN-END:variables
}
