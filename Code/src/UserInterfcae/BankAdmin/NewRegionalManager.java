/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfcae.BankAdmin;

import Business.Branch.Branch;
import Business.Business;
import Business.Demographics.Address;
import Business.Department.Department;
import Business.Employee.Employee;
import Business.Region.Region;
import Business.Role.RegionalManagerRole;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class NewRegionalManager extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private String regionName;
    private Business business;

    public NewRegionalManager(JPanel userProcessContainer,String regionName,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.regionName = regionName;
        this.business = business;
        
        comboGender.removeAllItems();
        comboGender.addItem("Male");
        comboGender.addItem("Female");
           
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtMiddelName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddressLine1 = new javax.swing.JTextField();
        txtAddressLine2 = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        comboGender = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtSSN = new javax.swing.JPasswordField();
        txtEmailAddress = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText(" New Regional Manager");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name ");

        jLabel3.setText("Middle Name ");

        jLabel4.setText("Last Name ");

        jLabel5.setText("Gender ");

        jLabel6.setText("Age ");

        jLabel7.setText("SSN ");

        jLabel8.setText("Address Line 1 ");

        jLabel9.setText("Address Line 2 ");

        jLabel10.setText("City ");

        jLabel11.setText("State ");

        jLabel12.setText("Zip Code ");

        jLabel13.setText("Country ");

        jLabel14.setText("Phone Number");

        jLabel15.setText("Email Address");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Username");

        jLabel17.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLastName)
                                    .addComponent(txtMiddelName)
                                    .addComponent(txtFirstName)
                                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(txtAddressLine2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(txtAddressLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(txtCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave))))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBack)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMiddelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnSave)
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        int age =0;
        int zipCode =0;
        int phoneNumber=0;
        String SSN = String.valueOf(txtSSN.getPassword());
        String username = txtUsername.getText().trim();
        String password = String.valueOf(txtPassword.getPassword());

        // To check for mandatory fields
       
       if (txtFirstName.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"First Name is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
       if (txtLastName.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"Last Name is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (txtAge.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"Age is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (SSN.equals(""))
        {
           JOptionPane.showMessageDialog(null,"SSN is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (txtAddressLine1.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"Address Line 1 is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (txtCity.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"City is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (txtState.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"State is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (txtCountry.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"Country is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (txtZipCode.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"Zip Code is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (txtPhoneNumber.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"Phone Number is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (txtEmailAddress.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"Email Address is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        
        if (txtUsername.getText().trim().equals(""))
        {
           JOptionPane.showMessageDialog(null,"Username is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        if (password.equals(""))
        {
           JOptionPane.showMessageDialog(null,"Password is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }
        
        // To check for numeric values
        
         try
        {
           age = Integer.parseInt(txtAge.getText().trim());
        }
        catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(null,"Age can only be a numeric value.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }  
        try
        {
           zipCode = Integer.parseInt(txtZipCode.getText().trim());
        }
        catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(null,"Zip Code can only be a numeric value.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }  
         try
        {
           phoneNumber = Integer.parseInt(txtPhoneNumber.getText().trim());
        }
        catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(null,"Phone Number can have only numerals.","WARNING",JOptionPane.WARNING_MESSAGE);
           return;
        }  
         
        String PasswordPattern="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,10})";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(password);
	if(matcher.matches()==false)
        {
          JOptionPane.showMessageDialog(null,"Please enter a Strong Password(1 numeral,1 lowerCase,1 UpperCase, 1 SpecialCharacter([@#$%]).","WARNING",JOptionPane.WARNING_MESSAGE);
          return;  
        }
        
         // To check whether username is unique
         Boolean isPresent = false;
              if(!(business.getUserAccountDirectory().getUserAccountList().isEmpty()))
            {
              isPresent = business.getUserAccountDirectory().checkIfUsernameIsUnique(username);
              if(isPresent==false)
              {
                for(Region r: business.getRegionDirectory().getRegionList())
                    {
                        isPresent=r.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                        if(isPresent==false)
                        {
                            for(Branch b: r.getBranchDirectory().getBranchList())
                            {
                                isPresent = b.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                                if(isPresent == false)
                                {
                                    for(Department d: b.getDepartmentDirectory().getDepartmentList())
                                    {
                                        isPresent = d.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                                        if(isPresent==true)
                                        {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }  
              }
              
            }
         if (isPresent==true)
         {
            JOptionPane.showMessageDialog(null,"Given Username already exists in the system.","WARNING",JOptionPane.WARNING_MESSAGE);
            return;  
         }
         
        
         
        // Creating region from previous page 
        Region region = business.getRegionDirectory().createRegion(regionName);
        region.setRegionName(regionName);
        //JOptionPane.showMessageDialog(null, "Region is created successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
        
		
      
       Employee e = region.getEmployeeDirectory().addEmployee();
       e.setFirstName(txtFirstName.getText().trim());
       e.setMiddleName(txtMiddelName.getText().trim());
       e.setLastName(txtLastName.getText().trim());
       e.setAge(Integer.parseInt(txtAge.getText().trim()));
       e.setGender((String)comboGender.getSelectedItem());
       e.setSSN(SSN);
       e.setPhoneNumber(txtPhoneNumber.getText().trim());
       e.setEmailAddress(txtEmailAddress.getText().trim());
       Address address = e.getAddress();
       address.setAddressLine1(txtAddressLine1.getText().trim());
       address.setAddressLine2(txtAddressLine2.getText().trim());
       address.setCity(txtCity.getText().trim());
       address.setState(txtState.getText().trim());
       address.setCountry(txtCountry.getText().trim());
       address.setZipCode(Integer.parseInt(txtZipCode.getText().trim()));
       
       // Creating UserAccount
     
         region.getUserAccountDirectory().createUserAccount(txtUsername.getText().trim(), password,e,new RegionalManagerRole());
        
       
       
       
       JOptionPane.showMessageDialog(null, "New Regional Manager is assigned to the newly created region: " + region.getRegionName() + " successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);  
       
        txtFirstName.setText("");
        txtMiddelName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        txtSSN.setText("");
        txtAddressLine1.setText("");
        txtAddressLine2.setText("");
        txtCity.setText("");
        txtCountry.setText("");
        txtEmailAddress.setText("");
        txtPassword.setText("");
        txtPhoneNumber.setText("");
        txtState.setText("");
        txtZipCode.setText("");
        txtUsername.setText("");
        comboGender.setSelectedItem("Male");
        
        btnSave.setEnabled(true);
       
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboGender;
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
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddelName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JPasswordField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
