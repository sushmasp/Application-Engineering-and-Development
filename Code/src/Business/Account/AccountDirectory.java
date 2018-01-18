/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Account;

import Business.Account.Account.AccountType;
import java.util.ArrayList;

/**
 *
 * @author kurki
 */
public class AccountDirectory {
    
    private ArrayList<Account> accountList;
    
    public AccountDirectory()
    {
        accountList = new ArrayList<>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }
    
    public Account createAccount(AccountType type)
    {
        Account account = null;
        
        if(type == Account.AccountType.CheckingAccount)
        {   
            account = new CheckingAccount();
        }
        else if (type == Account.AccountType.SavingsAccount)
        {
           account = new SavingsAccount();
        }
        accountList.add(account);
        return account;
    }
    
}
