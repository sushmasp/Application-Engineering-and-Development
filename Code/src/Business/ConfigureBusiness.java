/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Demographics.Address;
import Business.Employee.Employee;
import Business.Role.BankAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author kurki
 */
public class ConfigureBusiness {
    
    private static Business business;
    
    public static Business configure()
    {
        business = Business.getInstance();
        
        Employee employee = business.getEmployeeDirectory().addEmployee();
        employee.setFirstName("Anwesha");
        employee.setLastName("Kurki");
        Address address = employee.getAddress();
        address.setAddressLine1("14 Tr");
        address.setCity("Boston");
        address.setZipCode(01702);
               
        UserAccount ua = business.getUserAccountDirectory().createUserAccount("bankadmin", "Admin@123", employee,new BankAdminRole());
        
        return business;
    }    
    
}
