/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Account.Account;
import Business.Branch.Branch;
import Business.Customer.Customer;
import Business.Department.Department;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CashierChequeWorkRequest;
import Business.WorkQueue.CreditWorkRequest;
import Business.WorkQueue.DebitWorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class WorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Branch branch;
    private UserAccount userAccount;
    private Boolean isCredit = false;
    private Boolean isDebit = false;
    private Boolean isCashierCheck = false;
    private Customer fromCustomer;
    private ArrayList<Account> accountList;
    
    public WorkRequestJPanel(JPanel userProcessContainer,Branch branch,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.branch = branch;
        this.userAccount = userAccount;
        
        txtCheck.setEnabled(false);
        txtSav.setEnabled(false);
        txtEligible.setEnabled(false);
        
        lblAccount.setVisible(false);
        lblPayee.setVisible(false);
        lblAmount.setVisible(false);
        comboAccount.setVisible(false);
        txtPayee.setVisible(false);
        txtAmt.setVisible(false);
        lblMessage.setVisible(false);
        txtMsg.setVisible(false);
        btnSubmitRequest.setVisible(false);
        
       // From Customer Accounts
   
        fromCustomer = (Customer)userAccount.getPerson();  
        accountList = fromCustomer.getAccountDirectory().getAccountList();
        populateAccountBalance();
   
        
    }
    
    private void populateAccountBalance()
    {
        
        
        txtEligible.setText(String.valueOf(fromCustomer.getMaxLoanAmountBalanceAvailable()));

        for(Account a : accountList)
        {
            if(a.getAccountName().equals(Account.AccountType.CheckingAccount.getValue()))
            {
                txtCheck.setText(String.valueOf(a.getAccountBalance()));
            }
            else if(a.getAccountName().equals(Account.AccountType.SavingsAccount.getValue()))
            {
               txtSav.setText(String.valueOf(a.getAccountBalance())); 
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

        txtCheckingBalance = new javax.swing.JTextField();
        txtSavingsBalance = new javax.swing.JTextField();
        txtUnutilized = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtPurpose = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtMessgae = new javax.swing.JTextField();
        btnBck = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCreditRequest = new javax.swing.JButton();
        btnDebitRequest = new javax.swing.JButton();
        btnCashierCheckRequest = new javax.swing.JButton();
        lblAccount = new javax.swing.JLabel();
        comboAccount = new javax.swing.JComboBox();
        lblAmount = new javax.swing.JLabel();
        txtAmt = new javax.swing.JTextField();
        lblPayee = new javax.swing.JLabel();
        txtPayee = new javax.swing.JTextField();
        btnSubmitRequest = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtSav = new javax.swing.JTextField();
        txtCheck = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtEligible = new javax.swing.JTextField();

        jLabel17.setText("Eligible Loan Amount Balance");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setText("Purpose Of Loan");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Account Details");

        jLabel3.setText("Loan Amount");

        jLabel13.setText("Savings Account Balance");

        jLabel2.setText("Message   ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Loan Request");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Loan Request Details");

        jLabel8.setText("Checking Account Balance");

        btnSubmit.setText("Submit the Request");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBck.setText("<< Back");
        btnBck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBckActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Work Requests");

        btnCreditRequest.setText("Credit Request");
        btnCreditRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditRequestActionPerformed(evt);
            }
        });

        btnDebitRequest.setText("Debit Request");
        btnDebitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebitRequestActionPerformed(evt);
            }
        });

        btnCashierCheckRequest.setText("Cashier Check Request");
        btnCashierCheckRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierCheckRequestActionPerformed(evt);
            }
        });

        lblAccount.setText("From Account ");

        comboAccount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAmount.setText("Amount");

        lblPayee.setText("Pay To The Order Of");

        btnSubmitRequest.setText("Submit the Request");
        btnSubmitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRequestActionPerformed(evt);
            }
        });

        lblMessage.setText("Message");

        jLabel11.setText("Checking Account Balance");

        jLabel20.setText("Savings Account Balance");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Account Details");

        jLabel22.setText("Eligible Loan Amount Balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtSav, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txtEligible, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnCreditRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(lblAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(comboAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnDebitRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(lblPayee, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txtPayee, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnCashierCheckRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(btnSubmitRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnBck))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addComponent(jLabel21)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(txtCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(txtSav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel22))
                    .addComponent(txtEligible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnCreditRequest))
                    .addComponent(lblAccount)
                    .addComponent(comboAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnDebitRequest))
                    .addComponent(lblPayee)
                    .addComponent(txtPayee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnCashierCheckRequest))
                    .addComponent(lblAmount)
                    .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage)
                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnSubmitRequest)
                .addGap(66, 66, 66)
                .addComponent(btnBck))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBckActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBckActionPerformed

    private void btnDebitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebitRequestActionPerformed
        isDebit = true;
        lblAccount.setVisible(true);
        lblAccount.setText("From Account");
        comboAccount.setVisible(true);
        lblAmount.setVisible(true);
        txtAmt.setVisible(true);
        lblMessage.setVisible(true);
        txtMsg.setVisible(true);
        btnSubmitRequest.setVisible(true);
        lblPayee.setVisible(false);
        txtPayee.setVisible(false);
        comboAccount.removeAllItems();
        for(Account a: accountList )
        {
            comboAccount.addItem(a);
        }

    }//GEN-LAST:event_btnDebitRequestActionPerformed

    private void btnCreditRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditRequestActionPerformed
        isCredit =true;
        lblAccount.setVisible(true);
        lblAccount.setText("To Account");
        comboAccount.setVisible(true);
        lblAmount.setVisible(true);
        txtAmt.setVisible(true);
        lblMessage.setVisible(true);
        txtMsg.setVisible(true);
        btnSubmitRequest.setVisible(true);
        lblPayee.setVisible(false);
        txtPayee.setVisible(false);

        comboAccount.removeAllItems();
        for(Account a: accountList )
        {
            comboAccount.addItem(a);
        }

    }//GEN-LAST:event_btnCreditRequestActionPerformed

    private void btnSubmitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRequestActionPerformed

        Double amount;

        if (txtAmt.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Amount is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try
        {
            amount = Double.parseDouble(txtAmt.getText().trim());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Amount can only be a numeric value.","WARNING",JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (isDebit == true)
        {
            Account acc = (Account)comboAccount.getSelectedItem();
            Double balance = acc.getAccountBalance();

            if(amount>balance)
            {
                JOptionPane.showMessageDialog(null,"Insufficient Balance","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        // Credit Work Request
        if (isCredit == true)
        {
            CreditWorkRequest creditWorkRequest = new CreditWorkRequest();
            creditWorkRequest.setCreditAmount(amount);
            creditWorkRequest.setToAccount((Account)comboAccount.getSelectedItem());
            creditWorkRequest.setMessage(txtMessgae.getText().trim());
            creditWorkRequest.setStatus("Open");
            creditWorkRequest.setSender(userAccount);

            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy  HH:mm:ss");
            String ts=sdf.format(cal.getTime());

            creditWorkRequest.setRequestDate(ts);
            creditWorkRequest.setMessage(txtMessgae.getText().trim());

            // To add CreditWorkRequest in customer's WorkQueue
            userAccount.getWorkQueue().getWorkRequestList().add(creditWorkRequest);

            // To add CreditWorkRequest in Branch's Customer Service Department's WorkQueue
            for(Department d:branch.getDepartmentDirectory().getDepartmentList())
            {
                if(d.getDepartmentName().equals(Department.DepartmentType.CustomerServiceDepartment.getValue()))
                {
                    d.getWorkQueue().getWorkRequestList().add(creditWorkRequest);
                }
            }

            JOptionPane.showMessageDialog(null, "Credit Request is submitted successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
        }

        // Debit Work Request
        else if (isDebit == true)
        {
            DebitWorkRequest debitWorkRequest = new DebitWorkRequest();
            debitWorkRequest.setDebitAmount(amount);
            debitWorkRequest.setFromAccount((Account)comboAccount.getSelectedItem());
            debitWorkRequest.setMessage(txtMessgae.getText().trim());
            debitWorkRequest.setStatus("Open");
            debitWorkRequest.setSender(userAccount);

            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy  HH:mm:ss");
            String ts=sdf.format(cal.getTime());

            debitWorkRequest.setRequestDate(ts);
            debitWorkRequest.setMessage(txtMessgae.getText().trim());
            // To add DebitWorkRequest in customer's WorkQueue
            userAccount.getWorkQueue().getWorkRequestList().add(debitWorkRequest);

            // To add DebitWorkRequest in Branch's Customer Service Department's WorkQueue
            for(Department d:branch.getDepartmentDirectory().getDepartmentList())
            {
                if(d.getDepartmentName().equals(Department.DepartmentType.CustomerServiceDepartment.getValue()))
                {
                    d.getWorkQueue().getWorkRequestList().add(debitWorkRequest);
                }
            }

            JOptionPane.showMessageDialog(null, "Debit Request is submitted successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);

        }

        else if(isCashierCheck == true)
        {
            if(txtPayee.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Payee name is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }
            CashierChequeWorkRequest ccWorkRequest = new CashierChequeWorkRequest();
            ccWorkRequest.setAmount(amount);
            ccWorkRequest.setToPerson(txtPayee.getText().trim());
            ccWorkRequest.setMessage(txtMessgae.getText().trim());
            ccWorkRequest.setStatus("Open");
            ccWorkRequest.setSender(userAccount);

            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy  HH:mm:ss");
            String ts=sdf.format(cal.getTime());

            ccWorkRequest.setRequestDate(ts);
            ccWorkRequest.setMessage(txtMessgae.getText().trim());
            // To add DebitWorkRequest in customer's WorkQueue
            userAccount.getWorkQueue().getWorkRequestList().add(ccWorkRequest);

            // To add DebitWorkRequest in Branch's Customer Service Department's WorkQueue
            for(Department d:branch.getDepartmentDirectory().getDepartmentList())
            {
                if(d.getDepartmentName().equals(Department.DepartmentType.CustomerServiceDepartment.getValue()))
                {
                    d.getWorkQueue().getWorkRequestList().add(ccWorkRequest);
                }
            }

            JOptionPane.showMessageDialog(null, "Cashier Check Request is submitted successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);

        }

        lblAccount.setVisible(false);
        comboAccount.setVisible(false);
        lblPayee.setVisible(false);
        txtPayee.setVisible(false);
        lblAmount.setVisible(false);
        txtAmt.setVisible(false);
        btnSubmitRequest.setVisible(false);
        isCashierCheck=false;
        isCredit = false;
        isDebit = false;
        lblMessage.setVisible(false);
        txtMsg.setVisible(false);
    }//GEN-LAST:event_btnSubmitRequestActionPerformed

    private void btnCashierCheckRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierCheckRequestActionPerformed
        isCashierCheck =true;
        lblPayee.setVisible(true);
        txtPayee.setVisible(true);
        lblAmount.setVisible(true);
        txtAmt.setVisible(true);
        lblMessage.setVisible(true);
        txtMsg.setVisible(true);
        btnSubmitRequest.setVisible(true);

    }//GEN-LAST:event_btnCashierCheckRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBck;
    private javax.swing.JButton btnCashierCheckRequest;
    private javax.swing.JButton btnCreditRequest;
    private javax.swing.JButton btnDebitRequest;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmitRequest;
    private javax.swing.JComboBox comboAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPayee;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAmt;
    private javax.swing.JTextField txtCheck;
    private javax.swing.JTextField txtCheckingBalance;
    private javax.swing.JTextField txtEligible;
    private javax.swing.JTextField txtMessgae;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextField txtPayee;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtSav;
    private javax.swing.JTextField txtSavingsBalance;
    private javax.swing.JTextField txtUnutilized;
    // End of variables declaration//GEN-END:variables
}