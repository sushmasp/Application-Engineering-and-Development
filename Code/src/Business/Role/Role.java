/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Branch.Branch;
import Business.Business;
import Business.Department.Department;
import Business.Region.Region;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public abstract class Role {
    
    public enum RoleType{
        Customer("Customer"),
        Biller("Biller"),
        BankAdmin("Bank Admin"),
        RegionalManager("Regional Manager"),
        BranchManager("Branch Manager"),
        CustomerServiceEmployee("Customer Service Employee"),
        LoanEmployee("Loan Employee"),
        SecurityTier1Employee("Security Tier-1 Employee"),
        SecurityTier2Employee("Security Tier-2 Employee");
       
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract String getRoleType();
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
                                          UserAccount account,
                                          Region region,
                                          Branch branch, 
                                          Department department,
                                          Business business);
    
}
