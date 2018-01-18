/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Demographics.Person;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kurki
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory()
    {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
   public UserAccount authenticateUser(String username, String password,String role){
        for (UserAccount ua : userAccountList)
        {
              if (ua.getUsername().equals(username) && ua.getPassword().equals(password))
                {
                    if((role.equals("Customer")) && ((ua.getRole().getRoleType().equals(Role.RoleType.Biller.getValue())) ||
                                               (ua.getRole().getRoleType().equals(Role.RoleType.Customer.getValue())) ))
                        {
                         return ua;   
                        }
                    else if((role.equals("Employee")) && ((ua.getRole().getRoleType().equals(Role.RoleType.BankAdmin.getValue())) ||
                                               (ua.getRole().getRoleType().equals(Role.RoleType.BranchManager.getValue())) ||
                                               (ua.getRole().getRoleType().equals(Role.RoleType.CustomerServiceEmployee.getValue())) ||
                                               (ua.getRole().getRoleType().equals(Role.RoleType.LoanEmployee.getValue())) ||
                                               (ua.getRole().getRoleType().equals(Role.RoleType.RegionalManager.getValue())) ||
                                               (ua.getRole().getRoleType().equals(Role.RoleType.SecurityTier1Employee.getValue())) ||
                                               (ua.getRole().getRoleType().equals(Role.RoleType.SecurityTier2Employee.getValue())) ))
                            
                        {
                         return ua;   
                        }   
                    
                }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(UserAccount account,Role role)
    {
        account.setRole(role);
        userAccountList.add(account);
        return account;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return true;// Returns true if there is a match
        }
        return false;//Returns false if ther is no match
    }
    
    public UserAccount checkIfUsernameIsVaid(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return ua;
        }
        return null;
    }
    
}
