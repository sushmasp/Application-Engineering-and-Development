/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Account;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author kurki
 */
public abstract class Account {
    
    private String accountNumber;
    private String accountName;
    private double accountBalance;
    private String creationDate;
    private String accNameNumber;
    
    
    public Account(String name, String number)
    {
        accountName = name;
        accountNumber = number;
        accNameNumber = name +"-"+number;
        
      Calendar cal = Calendar.getInstance();
      SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy  HH:mm:ss"); 
      String ts=sdf.format(cal.getTime());
      this.creationDate = ts;
    }
    
    public enum AccountType{
        CheckingAccount("Checking Account"),
        SavingsAccount("Savings Account");
        
        private String value;
        private AccountType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCreationDate() {
        return creationDate;
    }
    
    @Override
    public String toString()
    {
        return this.accNameNumber;
       // return this.accountNumber;
    }
    
}
