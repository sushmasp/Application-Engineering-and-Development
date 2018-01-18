/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RegionalManager;

import Business.Branch.Branch;
import Business.Employee.Employee;
import Business.Region.Region;
import Business.Role.RegionalManagerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class UpdateBranchJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Region region;
    private Branch  branch;
    private Employee employee;
    private String name;
    
    public UpdateBranchJPanel(JPanel userProcessContainer,Region region,Branch  branch,Employee employee) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.region =region;
        this.branch = branch;
        this.employee =employee;
      
        name = branch.getBranchName();
        txtBranchName.setText(name);
        
        txtBranchManager.setEnabled(false);
        for(Employee e:branch.getEmployeeDirectory().getEmployeeList())
            {
               txtBranchManager.setText(e.toString());
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
        jLabel2 = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBranchManager = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Update Branch");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Branch Name");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setText("Branch Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnBack)
                .addContainerGap(667, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBranchManager, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBranchManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageBranchesJPanel manageBranches = (ManageBranchesJPanel) component;
        manageBranches.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtBranchName.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Branch Name is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(name.equals(txtBranchName.getText().trim()))
        {
            JOptionPane.showMessageDialog(null,"No changes to save.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        branch.setBranchName(txtBranchName.getText().trim());

        /*
        // To change the role of previous Regional Manager from Regional Manager to Unassigned
        UserAccount userAccount = null;
        for(UserAccount ua:branch.getUserAccountDirectory().getUserAccountList())
        {
            if(ua.getPerson()==employee)
            {
                userAccount=ua;
            }
        }
        employee.setStatus("Inactive");
        if(userAccount!=null)
        {
        branch.getUserAccountDirectory().changeRole(userAccount, new UnassignedRole());
        }

        Employee newEmployee =(Employee)comboBranchManager.getSelectedItem();
        // If the employee is already present in the Employee Directory of that Region just change the role;
        // If not present add employee to the Employee Directory of that Region.He is already having UserAcccount credentials as Regional Manager.
        Boolean isPresent = branch.getEmployeeDirectory().searchEmployee(newEmployee.getEmployeeID());
        if(isPresent==true)
        {
            branch.getUserAccountDirectory().changeRole(userAccount, new RegionalManagerRole());
            newEmployee.setStatus("Active");
        }
        else
        {
            branch.getEmployeeDirectory().addEmployee(newEmployee);
            newEmployee.setStatus("Active");
            branch.getUserAccountDirectory().createUserAccount(userAccount, new RegionalManagerRole());
        }
*/
        JOptionPane.showMessageDialog(null, "Branch is updated successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBranchManager;
    private javax.swing.JTextField txtBranchName;
    // End of variables declaration//GEN-END:variables
}