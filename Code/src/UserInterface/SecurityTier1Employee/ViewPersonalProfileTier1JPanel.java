/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SecurityTier1Employee;

import Business.Demographics.Address;
import Business.Demographics.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class ViewPersonalProfileTier1JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Person person;
    private Address address;
    
    public ViewPersonalProfileTier1JPanel(JPanel userProcessContainer,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount =userAccount;
        
        comboGender.removeAllItems();
        comboGender.addItem("Male");
        comboGender.addItem("Female");
        
        txtUsername.setText(userAccount.getUsername());
        txtPassword.setText(userAccount.getPassword());
         
        person = userAccount.getPerson();
        
        txtFirstName.setText(person.getFirstName());
        txtMiddelName.setText(person.getMiddleName());
        txtLastName.setText(person.getLastName());
        txtAge.setText(String.valueOf(person.getAge()));
        txtSSN.setText(person.getSSN());
        txtEmailAddress.setText(person.getEmailAddress());
        txtPhoneNumber.setText(person.getPhoneNumber());
        comboGender.setSelectedItem(person.getGender());
        
        address = person.getAddress();
        
        txtAddressLine1.setText(address.getAddressLine1());
        txtAddressLine2.setText(address.getAddressLine2());
        txtCity.setText(address.getCity());
        txtState.setText(address.getState());
        txtCountry.setText(address.getCountry());
        txtZipCode.setText(String.valueOf(address.getZipCode()));
        
        txtFirstName.setEnabled(false);
        txtMiddelName.setEnabled(false);
        txtLastName.setEnabled(false);
        txtAge.setEnabled(false);
        txtSSN.setEnabled(false);
        txtAddressLine1.setEnabled(false);
        txtAddressLine2.setEnabled(false);
        txtCity.setEnabled(false);
        txtCountry.setEnabled(false);
        txtEmailAddress.setEnabled(false);
        txtPassword.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
        txtState.setEnabled(false);
        txtZipCode.setEnabled(false);
        txtUsername.setEnabled(false);
        comboGender.setEnabled(false);
        btnSave.setEnabled(false);
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtAddressLine1 = new javax.swing.JTextField();
        txtMiddelName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JPasswordField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtAddressLine2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel17.setText("Password");

        jLabel7.setText("SSN ");

        jLabel3.setText("Middle Name ");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel14.setText("Phone Number");

        jLabel10.setText("City ");

        jLabel11.setText("State ");

        jLabel6.setText("Age ");

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Last Name ");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        jLabel5.setText("Gender ");

        jLabel12.setText("Zip Code ");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel8.setText("Address Line 1 ");

        jLabel15.setText("Email Address");

        jLabel13.setText("Country ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Personal Profile");

        jLabel2.setText("First Name ");

        jLabel9.setText("Address Line 2 ");

        jLabel16.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnUpdate)
                        .addGap(67, 67, 67)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(302, 302, 302))
                                    .addGroup(layout.createSequentialGroup()
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
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(68, 68, 68)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(42, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(34, 34, 34)
                .addComponent(btnBack)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        int age =0;
        int zipCode =0;
        int phoneNumber=0;
        String password = String.valueOf(txtPassword.getPassword());

        // To check for mandatory fields

        if (txtAge.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Age is mandatory.","WARNING",JOptionPane.WARNING_MESSAGE);
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
        Matcher matcher = pattern.matcher(txtPassword.getText().trim());
	if(matcher.matches()==false)
        {
          JOptionPane.showMessageDialog(null,"Please enter a Strong Password(1 numeral,1 lowerCase,1 UpperCase, 1 SpecialCharacter([@#$%]).","WARNING",JOptionPane.WARNING_MESSAGE);
          return;  
        }
        person.setAge(Integer.parseInt(txtAge.getText().trim()));
        person.setPhoneNumber(txtPhoneNumber.getText().trim());
        person.setEmailAddress(txtEmailAddress.getText().trim());

        address.setAddressLine1(txtAddressLine1.getText().trim());
        address.setAddressLine2(txtAddressLine2.getText().trim());
        address.setCity(txtCity.getText().trim());
        address.setState(txtState.getText().trim());
        address.setCountry(txtCountry.getText().trim());
        address.setZipCode(Integer.parseInt(txtZipCode.getText().trim()));

        
        userAccount.setPassword(password);

        JOptionPane.showMessageDialog(null, "Personal details updated successfully.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        txtAge.setEnabled(false);
        txtAddressLine1.setEnabled(false);
        txtAddressLine2.setEnabled(false);
        txtCity.setEnabled(false);
        txtCountry.setEnabled(false);
        txtEmailAddress.setEnabled(false);
        txtPassword.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
        txtState.setEnabled(false);
        txtZipCode.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        txtAge.setEnabled(true);
        txtAddressLine1.setEnabled(true);
        txtAddressLine2.setEnabled(true);
        txtCity.setEnabled(true);
        txtCountry.setEnabled(true);
        txtEmailAddress.setEnabled(true);
        txtPassword.setEnabled(true);
        txtPhoneNumber.setEnabled(true);
        txtState.setEnabled(true);
        txtZipCode.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
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
