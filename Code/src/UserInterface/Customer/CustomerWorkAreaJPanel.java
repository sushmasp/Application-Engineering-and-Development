/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Branch.Branch;
import Business.Business;
import Business.Department.Department;
import Business.Region.Region;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerServiceEmployee.AddNewCustomerJPanel;
import UserInterface.CustomerServiceEmployee.OpenRequestsCustomerEmpJPanel;
import UserInterface.CustomerServiceEmployee.RequestsProcessedCustomerEmpJPanel;
import UserInterface.CustomerServiceEmployee.UpdatePersonalProfileCustomerEmpJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Region region;
    private Branch branch;
    private Business business;
    
    public CustomerWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,Region region,Branch branch,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.region = region;
        this.branch = branch;
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

        btnOnlineCreditDebit = new javax.swing.JButton();
        btnBillPayment = new javax.swing.JButton();
        btnUpdatePersonalProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnWorkRequest = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        btnRequestLoan = new javax.swing.JButton();
        btnHIsWorkRequests = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();

        btnOnlineCreditDebit.setText("Online Credit / Debit");
        btnOnlineCreditDebit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnlineCreditDebitActionPerformed(evt);
            }
        });

        btnBillPayment.setText("Bill Payment");
        btnBillPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillPaymentActionPerformed(evt);
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

        btnWorkRequest.setText("Credit / Debit / Cashier Cheque Request");
        btnWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkRequestActionPerformed(evt);
            }
        });

        btnRequestLoan.setText("Request Loan");
        btnRequestLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestLoanActionPerformed(evt);
            }
        });

        btnHIsWorkRequests.setText("His Work Requests ");
        btnHIsWorkRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHIsWorkRequestsActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblRole.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRequestLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOnlineCreditDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnWorkRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdatePersonalProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnHIsWorkRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblName))
                .addGap(12, 12, 12)
                .addComponent(lblRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addGap(69, 69, 69)
                .addComponent(btnOnlineCreditDebit)
                .addGap(30, 30, 30)
                .addComponent(btnWorkRequest)
                .addGap(32, 32, 32)
                .addComponent(btnRequestLoan)
                .addGap(34, 34, 34)
                .addComponent(btnBillPayment)
                .addGap(28, 28, 28)
                .addComponent(btnHIsWorkRequests)
                .addGap(29, 29, 29)
                .addComponent(btnUpdatePersonalProfile)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOnlineCreditDebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnlineCreditDebitActionPerformed
        OnlineCreditDebitJPanel online = new OnlineCreditDebitJPanel(userProcessContainer,branch,userAccount,business);
        userProcessContainer.add("OpenRequestsCustomerEmpJPanel",online);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOnlineCreditDebitActionPerformed

    private void btnBillPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillPaymentActionPerformed
        BillPaymentJPanel billPayment = new BillPaymentJPanel(userProcessContainer,branch,userAccount,business);
        userProcessContainer.add("BillPaymentJPanel",billPayment);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBillPaymentActionPerformed

    private void btnUpdatePersonalProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonalProfileActionPerformed
        ViewPersonalProfileJPanel viewPersonalProfile = new ViewPersonalProfileJPanel(userProcessContainer,userAccount);
        userProcessContainer.add("ViewPersonalProfileJPanel",viewPersonalProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdatePersonalProfileActionPerformed

    private void btnWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkRequestActionPerformed
        WorkRequestJPanel workRequest = new WorkRequestJPanel(userProcessContainer,branch,userAccount);
        userProcessContainer.add("WorkRequestJPanel",workRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkRequestActionPerformed

    private void btnRequestLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestLoanActionPerformed
        LoanRequestJPanel loanRequest = new LoanRequestJPanel(userProcessContainer,branch,userAccount);
        userProcessContainer.add("LoanRequestJPanel",loanRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestLoanActionPerformed

    private void btnHIsWorkRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHIsWorkRequestsActionPerformed
        HisWorkRequestsJPanel hisWorkRequests = new HisWorkRequestsJPanel(userProcessContainer,userAccount);
        userProcessContainer.add("HisWorkRequestsJPanel",hisWorkRequests);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHIsWorkRequestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBillPayment;
    private javax.swing.JButton btnHIsWorkRequests;
    private javax.swing.JButton btnOnlineCreditDebit;
    private javax.swing.JButton btnRequestLoan;
    private javax.swing.JButton btnUpdatePersonalProfile;
    private javax.swing.JButton btnWorkRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
