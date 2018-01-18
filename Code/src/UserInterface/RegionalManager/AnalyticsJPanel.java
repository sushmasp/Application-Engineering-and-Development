/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RegionalManager;

import Business.Region.Region;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class AnalyticsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Region region;
  
    public AnalyticsJPanel(JPanel userProcessContainer,Region region) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.region =region;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnBranchesByTotalDepositAmount = new javax.swing.JButton();
        btnBranchesbyEmployeeCount = new javax.swing.JButton();
        btnBranchesByCustomerCount = new javax.swing.JButton();
        btnBranchesByTotalLoanAmountIssued = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Analytics");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBranchesByTotalDepositAmount.setText(" Branches by Total  Deposit Amount");
        btnBranchesByTotalDepositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchesByTotalDepositAmountActionPerformed(evt);
            }
        });

        btnBranchesbyEmployeeCount.setText("Branches by Employee Count");
        btnBranchesbyEmployeeCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchesbyEmployeeCountActionPerformed(evt);
            }
        });

        btnBranchesByCustomerCount.setText("Branches by Customer Count");
        btnBranchesByCustomerCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchesByCustomerCountActionPerformed(evt);
            }
        });

        btnBranchesByTotalLoanAmountIssued.setText("Branches by Total Loan Amount Issued");
        btnBranchesByTotalLoanAmountIssued.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchesByTotalLoanAmountIssuedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBranchesByCustomerCount, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(btnBranchesbyEmployeeCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBranchesByTotalLoanAmountIssued, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(btnBranchesByTotalDepositAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(btnBranchesByCustomerCount)
                .addGap(39, 39, 39)
                .addComponent(btnBranchesbyEmployeeCount)
                .addGap(45, 45, 45)
                .addComponent(btnBranchesByTotalDepositAmount)
                .addGap(50, 50, 50)
                .addComponent(btnBranchesByTotalLoanAmountIssued)
                .addGap(115, 115, 115)
                .addComponent(btnBack)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBranchesByTotalDepositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchesByTotalDepositAmountActionPerformed
        BranchesByToalDepositAmountJPanel deposits = new BranchesByToalDepositAmountJPanel(userProcessContainer,region);
        userProcessContainer.add("BranchesByToalDepositAmountJPanel",deposits);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBranchesByTotalDepositAmountActionPerformed

    private void btnBranchesbyEmployeeCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchesbyEmployeeCountActionPerformed
        BranchesByEmployeeCountJPanel employeeCount = new BranchesByEmployeeCountJPanel(userProcessContainer,region);
        userProcessContainer.add("BranchesByEmployeeCountJPanel",employeeCount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBranchesbyEmployeeCountActionPerformed

    private void btnBranchesByCustomerCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchesByCustomerCountActionPerformed
        BranchesByCustomerCountJPanel customerCount = new BranchesByCustomerCountJPanel(userProcessContainer,region);
        userProcessContainer.add("BranchesByCustomerCountJPanel",customerCount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBranchesByCustomerCountActionPerformed

    private void btnBranchesByTotalLoanAmountIssuedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchesByTotalLoanAmountIssuedActionPerformed
        BranchesByTotalLoanIssuedJPanel loanIssued = new BranchesByTotalLoanIssuedJPanel(userProcessContainer,region);
        userProcessContainer.add("BranchesByTotalLoanIssuedJPanel",loanIssued);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBranchesByTotalLoanAmountIssuedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBranchesByCustomerCount;
    private javax.swing.JButton btnBranchesByTotalDepositAmount;
    private javax.swing.JButton btnBranchesByTotalLoanAmountIssued;
    private javax.swing.JButton btnBranchesbyEmployeeCount;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
