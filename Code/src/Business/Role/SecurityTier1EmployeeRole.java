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
import UserInterface.SecurityTier1Employee.SecurityTier1EmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kurki
 */
public class SecurityTier1EmployeeRole extends Role{
    
    private String roleType;
    
    public SecurityTier1EmployeeRole()
    {
        this.roleType = Role.RoleType.SecurityTier1Employee.getValue();
    }

    @Override
    public String getRoleType() {
        return roleType;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Region region, Branch branch, Department department, Business business) {
        return new SecurityTier1EmployeeWorkAreaJPanel(userProcessContainer,account,region,branch,department,business);
    }
       
}
