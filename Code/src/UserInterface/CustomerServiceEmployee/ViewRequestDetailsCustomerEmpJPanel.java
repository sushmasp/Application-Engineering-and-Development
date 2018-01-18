/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerServiceEmployee;

import Business.Account.Account;
import Business.Branch.Branch;
import Business.Business;
import Business.Customer.Customer;
import Business.Department.Department;
import Business.Employee.Employee;
import Business.Region.Region;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CashierChequeWorkRequest;
import Business.WorkQueue.CreditWorkRequest;
import Business.WorkQueue.DebitWorkRequest;
import Business.WorkQueue.LoanWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class ViewRequestDetailsCustomerEmpJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WorkRequest workrequest;
    private Branch branch;
    private Department department;
    private UserAccount userAccount;
    private Business business;
    private Account fromAccount;
    private Account toAccount;
    private Customer toCustomer;
    
    public ViewRequestDetailsCustomerEmpJPanel(JPanel userProcessContainer,WorkRequest workrequest,Branch branch,Department department,UserAccount userAccount,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.workrequest = workrequest;
        this.branch = branch;
        this.department = department;
        this.userAccount = userAccount;
        this.business = business;
       
        if(workrequest.getStatus().equals("Approved"))
        {
            btnUpdate.setEnabled(false);
        }
        else
        {
            btnUpdate.setEnabled(true);
        }
        
        comboStatus.removeAllItems();
        comboStatus.addItem("Open");
        comboStatus.addItem("Approved");
                
        if(workrequest instanceof CreditWorkRequest)
           {
               txtID.setText(((CreditWorkRequest) workrequest).getCreditWorkRequestID());
               txtAmount.setText(String.valueOf(((CreditWorkRequest) workrequest).getCreditAmount()));
               txtType.setText("Credit");    
               toAccount = ((CreditWorkRequest) workrequest).getToAccount();         
               txtToAccNum.setText(toAccount.getAccountNumber());
            }                             
        else if (workrequest instanceof DebitWorkRequest)
            {
                txtID.setText(((DebitWorkRequest) workrequest).getDebitWorkRequestID());
                txtAmount.setText(String.valueOf(((DebitWorkRequest) workrequest).getDebitAmount()));
                txtType.setText("Debit");
                fromAccount = ((DebitWorkRequest) workrequest).getFromAccount();         
                txtFromAccNum.setText(fromAccount.getAccountNumber());
            }
        else if (workrequest instanceof CashierChequeWorkRequest)
            { 
                txtID.setText(((CashierChequeWorkRequest) workrequest).getCashierChequeRequestID());
                txtAmount.setText(String.valueOf(((CashierChequeWorkRequest) workrequest).getAmount()));
                txtType.setText("Cashier Check");
                txtToCustomer.setText(((CashierChequeWorkRequest) workrequest).getToPerson());
            }
     
        txtCustomer.setText(workrequest.getSender().getPerson().toString());
        txtEmployee.setText(workrequest.getReceiver().getPerson().toString());
        txtMessage.setText(String.valueOf(workrequest.getMessage()));
        txtRequestedDate.setText(workrequest.getRequestDate());
        txtResolvedDate.setText(workrequest.getResolveDate());
        comboStatus.setSelectedItem(workrequest.getStatus());
        
        btnSave.setEnabled(false);
        txtMessage.setEnabled(false);
        comboStatus.setEnabled(false);
        txtCustomer.setEnabled(false);
        txtEmployee.setEnabled(false);
        txtAmount.setEnabled(false);
        txtID.setEnabled(false);
        txtMessage.setEnabled(false);
        txtType.setEnabled(false);
        txtRequestedDate.setEnabled(false);
        txtResolvedDate.setEnabled(false);
        txtCheckingBalance.setEnabled(false);
        txtSavingsBalance.setEnabled(false);
        txtFromAccNum.setEnabled(false);
        txtToAccNum.setEnabled(false);
        txtToCustomer.setEnabled(false);
        txtDate.setEnabled(false);
        
       populateBalance();
        
   
    }
    
    private void populateBalance()
    {
        Customer c = (Customer)workrequest.getSender().getPerson();
        ArrayList<Account> accountList = c.getAccountDirectory().getAccountList();
        for(Account a : accountList)
        {
            if(a.getAccountName().equals(Account.AccountType.CheckingAccount.getValue()))
            {
                txtCheckingBalance.setText(String.valueOf(a.getAccountBalance()));
                txtDate.setText(a.getCreationDate());
            }
            else if(a.getAccountName().equals(Account.AccountType.SavingsAccount.getValue()))
            {
               txtSavingsBalance.setText(String.valueOf(a.getAccountBalance())); 
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

        txtSavingsBalance = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtCheckingBalance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFromAccNum = new javax.swing.JTextField();
        txtEmployee = new javax.swing.JTextField();
        txtToAccNum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtToCustomer = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtCustomer = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        txtAmount = new javax.swing.JTextField();
        txtResolvedDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRequestedDate = new javax.swing.JTextField();

        btnUpdate.setText("Process");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("View Request Details");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Customer Details");

        jLabel15.setText("Customer since");

        jLabel8.setText("Checking Account Balance");

        jLabel13.setText("Savings Account Balance");

        jLabel10.setText("Amount ");

        jLabel6.setText("Status");

        jLabel7.setText("Requested Date");

        jLabel17.setText("To Customer");

        jLabel12.setText("Resolved Date");

        jLabel11.setText("From Account ");

        jLabel2.setText(" Request ID");

        jLabel16.setText("To Account");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Customer Requested");

        jLabel4.setText("Employee Processed");

        jLabel5.setText("Message");

        jLabel9.setText("Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtToCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFromAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRequestedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResolvedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCheckingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtSavingsBalance)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtDate)))
                        .addGap(322, 322, 322))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnUpdate)
                        .addGap(70, 70, 70)
                        .addComponent(btnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnSave))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFromAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtToAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRequestedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtResolvedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtToCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtCheckingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtSavingsBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)))
                .addComponent(btnBack)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnSave.setEnabled(true);
        txtMessage.setEnabled(true);
        comboStatus.setEnabled(true);
        comboStatus.removeAllItems();
        comboStatus.addItem("Approved");
        
      Calendar cal = Calendar.getInstance();
      SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy  HH:mm:ss"); 
      String ts=sdf.format(cal.getTime());
      txtResolvedDate.setText(ts);
      btnUpdate.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Customer fromCustomer = (Customer)workrequest.getSender().getPerson();
        ArrayList<Account> accountList;
        Double oldAccountBalance;
        
        // For Cashier Cheque no transactions is needed.
        
        
        // For Credit Request
       if (workrequest instanceof CreditWorkRequest)
       {
           // To credit the amount to ToAccount
           
           Customer c = (Customer)workrequest.getSender().getPerson();
           accountList = c.getAccountDirectory().getAccountList();
            for(Account a : accountList)
                {
                  if(a==toAccount)
                    {
                        oldAccountBalance= toAccount.getAccountBalance();
                        a.setAccountBalance((oldAccountBalance)+(Double.parseDouble(txtAmount.getText().trim())));
                    }
                }
                   
       }
       
       // For Debit Request
       
       
       if (workrequest instanceof DebitWorkRequest)
       {
           
           // To debit the amount from FromAccount
           
           Customer c = (Customer)workrequest.getSender().getPerson();
           accountList = c.getAccountDirectory().getAccountList();
            for(Account a : accountList)
                {
                  if(a==fromAccount)
                    {
                        oldAccountBalance= fromAccount.getAccountBalance();
                        Double requestedAmount = Double.parseDouble(txtAmount.getText().trim());
                        if(oldAccountBalance>requestedAmount)
                          {
                            a.setAccountBalance((oldAccountBalance)-(requestedAmount));
                          }
                    }
                }  
       }   
        
       // To set the status in Work Queue of Customer
       Customer customer = (Customer) workrequest.getSender().getPerson();
       for(UserAccount ua:branch.getUserAccountDirectory().getUserAccountList())
        {
            if(ua.getPerson()==customer)
            {
                for(WorkRequest w : ua.getWorkQueue().getWorkRequestList())
                {
                        if(w==workrequest)
                        {
                            w.setStatus((String)comboStatus.getSelectedItem());
                            w.setMessage(txtMessage.getText().trim());
                        }
                }
            }
        }
       
       // To set the status in Work Queue of Employee
       
       Employee employee = (Employee) workrequest.getReceiver().getPerson();
       for(UserAccount ua:branch.getUserAccountDirectory().getUserAccountList())
        {
            if(ua.getPerson()==employee)
            {
                for(WorkRequest w : ua.getWorkQueue().getWorkRequestList())
                {
                        if(w==workrequest)
                        {
                            w.setStatus((String)comboStatus.getSelectedItem());
                            w.setMessage(txtMessage.getText().trim());
                        }
                }
            }
        }
       workrequest.setResolveDate(txtResolvedDate.getText().trim());
       
        JOptionPane.showMessageDialog(null, "Request is processed successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);

        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        txtMessage.setEnabled(false);
        comboStatus.setEnabled(false);
        btnUpdate.setEnabled(true);
        if(workrequest.getStatus().equals("Approved"))
        {
            btnUpdate.setEnabled(false);
        }
        else
        {
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RequestsProcessedCustomerEmpJPanel loanRequests = (RequestsProcessedCustomerEmpJPanel) component;
        loanRequests.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCheckingBalance;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmployee;
    private javax.swing.JTextField txtFromAccNum;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtRequestedDate;
    private javax.swing.JTextField txtResolvedDate;
    private javax.swing.JTextField txtSavingsBalance;
    private javax.swing.JTextField txtToAccNum;
    private javax.swing.JTextField txtToCustomer;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
