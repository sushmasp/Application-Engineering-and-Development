/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SecurityTier1Employee;

import Business.Branch.Branch;
import Business.Business;
import Business.Customer.Customer;
import Business.Department.Department;
import Business.Employee.Employee;
import Business.Log;
import Business.LogDirectory;
import Business.Region.Region;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LoanWorkRequest;
import Business.WorkQueue.SecurityWorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kurki
 */
public class ViewLogJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Region region;
    private Branch branch;
    private Department department;
    private Business business;
    
    public ViewLogJPanel(JPanel userProcessContainer,UserAccount userAccount,Region region,Branch branch,Department department,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.region = region;
        this.branch = branch;
        this.department = department;
        this.business = business;
        radBtnBranch.setSelected(true);
        populateTableBranch();
        lblName.setVisible(false);
        comboName.setVisible(false);
        btnLoad.setVisible(false);
    
    }
    
    private void populateTableBranch()
    {
        Boolean isPresent = false;
        DefaultTableModel dtm = (DefaultTableModel) tblLogs.getModel();
        dtm.setRowCount(0);
        
        if(!(business.getLogDirectory().getLogList().isEmpty()))
        {
            for (Log log : business.getLogDirectory().getLogList())
            {
                if(log.getBranch()==branch)
                {
                    Object[] row = new Object[5];
                    row[0]= log;
                    row[1] =log.getRole();
                    row[2] =log.getIPAddress();
                    row[3] =log.getTime();
                    row[4] =log.getMessage();
                    dtm.addRow(row);
                    isPresent=true;
                }
            }
        }
        btnRaise.setEnabled(true);
        if(isPresent==false)
        {
           JOptionPane.showMessageDialog(null,"No logs found for the branch.","WARNING",JOptionPane.WARNING_MESSAGE);
           btnRaise.setEnabled(false);
        }
    }
    
    private void populateTableEmployee()
    {
        Boolean isPresent = false;
        DefaultTableModel dtm = (DefaultTableModel) tblLogs.getModel();
        dtm.setRowCount(0);
        
        String name= String.valueOf(comboName.getSelectedItem());
        
        if(!(business.getLogDirectory().getLogList().isEmpty()))
        {
            for (Log log : business.getLogDirectory().getLogList())
            {
               if(log.getName().equals(name) && log.getBranch()==branch && !(log.getRole().equals("Customer")) && !(log.getRole().equals("Biller")))
               {
                 Object[] row = new Object[5];
                 row[0]= log;
                  row[1] =log.getRole();
                  row[2] =log.getIPAddress();
                  row[3] =log.getTime();
                  row[4] =log.getMessage();
                  dtm.addRow(row);
                  isPresent=true;
                }  
            }
        }
        btnRaise.setEnabled(true);
        if(isPresent==false)
        {
           JOptionPane.showMessageDialog(null,"No logs found for the selected employee.","WARNING",JOptionPane.WARNING_MESSAGE);
           btnRaise.setEnabled(false);
        }  
       
    }
    
    private void populateTableCustomer()
    {
        Boolean isPresent = false;
        DefaultTableModel dtm = (DefaultTableModel) tblLogs.getModel();
        dtm.setRowCount(0);
        
        String name= String.valueOf(comboName.getSelectedItem());
        
        if(!(business.getLogDirectory().getLogList().isEmpty()))
        {
            for (Log log : business.getLogDirectory().getLogList())
            {
               if(log.getName().equals(name) && log.getBranch()==branch && (log.getRole().equals("Customer")) && (log.getRole().equals("Biller")))
               {
                  Object[] row = new Object[5];
                  row[0]= log;
                  row[1] =log.getRole();
                  row[2] =log.getIPAddress();
                  row[3] =log.getTime();
                  row[4] =log.getMessage();
                  dtm.addRow(row);
                  isPresent=true;
                }  
            }
        }
        btnRaise.setEnabled(true);
        if(isPresent==false)
        {
           JOptionPane.showMessageDialog(null,"No logs found for the selected customer.","WARNING",JOptionPane.WARNING_MESSAGE);
           btnRaise.setEnabled(false);
        }  
      
    }

    private void populateTableInvalid()
    {
       Boolean isPresent = false;
        DefaultTableModel dtm = (DefaultTableModel) tblLogs.getModel();
        dtm.setRowCount(0);
        
        if(!(business.getLogDirectory().getLogList().isEmpty()))
        {
            for (Log log : business.getLogDirectory().getLogList())
            {
                if(log.getMessage().equals("Invalid User"))
                {
                    Object[] row = new Object[5];
                    row[0]= log;
                    row[1] =log.getRole();
                    row[2] =log.getIPAddress();
                    row[3] =log.getTime();
                    row[4] =log.getMessage();
                    dtm.addRow(row);
                    isPresent=true;
                }
            }
        }
        btnRaise.setEnabled(true);
        if(isPresent==false)
        {
           JOptionPane.showMessageDialog(null,"No logs found.","WARNING",JOptionPane.WARNING_MESSAGE);
           btnRaise.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLogs = new javax.swing.JTable();
        radBtnBranch = new javax.swing.JRadioButton();
        radBtnEmployee = new javax.swing.JRadioButton();
        radBtnCustomer = new javax.swing.JRadioButton();
        radBtnInvalid = new javax.swing.JRadioButton();
        comboName = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnRaise = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("View Logs");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblLogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role", "IP Address", "Time", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLogs);

        radBtnBranch.setText("Log Of Home Branch");
        radBtnBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnBranchActionPerformed(evt);
            }
        });

        radBtnEmployee.setText("Log of Specific Employee");
        radBtnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnEmployeeActionPerformed(evt);
            }
        });

        radBtnCustomer.setText("Log Of Specific Customer");
        radBtnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnCustomerActionPerformed(evt);
            }
        });

        radBtnInvalid.setText("Invalid Logins");
        radBtnInvalid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnInvalidActionPerformed(evt);
            }
        });

        comboName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNameActionPerformed(evt);
            }
        });

        lblName.setText("Name");

        btnLoad.setText("Load Logs");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnRaise.setText("Raise a Security Request");
        btnRaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radBtnBranch)
                                .addGap(73, 73, 73)
                                .addComponent(radBtnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoad)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radBtnCustomer)
                                .addGap(69, 69, 69)
                                .addComponent(radBtnInvalid))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnRaise, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radBtnEmployee)
                    .addComponent(radBtnCustomer)
                    .addComponent(radBtnInvalid)
                    .addComponent(radBtnBranch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(btnLoad))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRaise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void radBtnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnEmployeeActionPerformed
        lblName.setVisible(true);
        comboName.setVisible(true);
        btnLoad.setVisible(true);
        lblName.setText("Employee");
        radBtnCustomer.setSelected(false);
        radBtnInvalid.setSelected(false);
        radBtnBranch.setSelected(false);
        
        comboName.removeAllItems();
        if(!(branch.getDepartmentDirectory().getDepartmentList().isEmpty()))
                {
                    for(Department d:branch.getDepartmentDirectory().getDepartmentList())
                    {
                        if(!(d.getEmployeeDirectory().getEmployeeList().isEmpty()))
                            {
                                for(Employee e:d.getEmployeeDirectory().getEmployeeList())
                                {
                                    comboName.addItem(e.toString());
                                }
                                
                            }
                    }
                }
        

    }//GEN-LAST:event_radBtnEmployeeActionPerformed

    private void radBtnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnCustomerActionPerformed
        lblName.setVisible(true);
        comboName.setVisible(true);
        btnLoad.setVisible(true);
        lblName.setText("Customer");
        
        radBtnEmployee.setSelected(false);
        radBtnInvalid.setSelected(false);
        radBtnBranch.setSelected(false);
        
        comboName.removeAllItems();
        if(!(branch.getCustomerDirectory().getCustomerList().isEmpty()))
                {
                    for(Customer c:branch.getCustomerDirectory().getCustomerList())
                    {
                      comboName.addItem(c.toString());
                    }
                }    
        
       
    }//GEN-LAST:event_radBtnCustomerActionPerformed

    private void radBtnInvalidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnInvalidActionPerformed
        lblName.setVisible(false);
        comboName.setVisible(false);
        btnLoad.setVisible(false);
        radBtnCustomer.setSelected(false);
        radBtnEmployee.setSelected(false);
        radBtnBranch.setSelected(false);
        populateTableInvalid();
        
    }//GEN-LAST:event_radBtnInvalidActionPerformed

    private void radBtnBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnBranchActionPerformed
        lblName.setVisible(false);
        comboName.setVisible(false);
        btnLoad.setVisible(false);
             
       radBtnCustomer.setSelected(false);
       radBtnEmployee.setSelected(false);
       radBtnInvalid.setSelected(false);
        populateTableBranch();
    }//GEN-LAST:event_radBtnBranchActionPerformed

    private void comboNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNameActionPerformed
                
        
    }//GEN-LAST:event_comboNameActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        if(comboName.getSelectedItem().equals(""))
        {
            return;
        }
        else
        {
            if(radBtnEmployee.isSelected())
            {
                populateTableEmployee();
            }
            else if (radBtnCustomer.isSelected())
            {
                populateTableCustomer();
            }
        }
        
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnRaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseActionPerformed
       
        int[] selection = tblLogs.getSelectedRows();

        if (selection.length ==0)
        {
            JOptionPane.showMessageDialog(null, "Please select logs.","WARNING",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        SecurityWorkRequest request  = new SecurityWorkRequest();
        LogDirectory list = request.getLogDirectory();
        for(int i=0;i<selection.length;i++)
        {
           list.addLog((Log)tblLogs.getValueAt(selection[i],0));
        }
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy  HH:mm:ss"); 
        String ts=sdf.format(cal.getTime());
        
        request.setSender(userAccount);
        request.setRequestDate(ts);
        request.setStatus("Open");
        
        
        // To add loanWorkRequest in employee's WorkQueue
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        // To add loanWorkRequest in Branch's Loan Department's WorkQueue 
         for(Department d:branch.getDepartmentDirectory().getDepartmentList())
         {
             if(d.getDepartmentName().equals(Department.DepartmentType.SecurityDepartment.getValue()))
             {
                 d.getWorkQueue().getWorkRequestList().add(request);
             }
         }
        
        JOptionPane.showMessageDialog(null, "Security Request is submitted successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
     
        
    }//GEN-LAST:event_btnRaiseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnRaise;
    private javax.swing.JComboBox<String> comboName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JRadioButton radBtnBranch;
    private javax.swing.JRadioButton radBtnCustomer;
    private javax.swing.JRadioButton radBtnEmployee;
    private javax.swing.JRadioButton radBtnInvalid;
    private javax.swing.JTable tblLogs;
    // End of variables declaration//GEN-END:variables
}
