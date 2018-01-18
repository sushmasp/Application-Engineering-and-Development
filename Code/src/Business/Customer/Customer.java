/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Account.AccountDirectory;
import Business.Demographics.Person;

/**
 *
 * @author kurki
 */
public class Customer extends Person {
    
    private static int count=0;
    private int customerID;
    private AccountDirectory accountDirectory;
    private double maxLoanAmountBalanceAvailable;
    private CustomerDirectory payeeList;
    
    public Customer()
    {
        customerID = ++count;
        accountDirectory = new AccountDirectory();
        payeeList = new CustomerDirectory();
        maxLoanAmountBalanceAvailable = 10000;
    }

    public int getCustomerID() {
        return customerID;
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public double getMaxLoanAmountBalanceAvailable() {
        return maxLoanAmountBalanceAvailable;
    }

    public void setMaxLoanAmountBalanceAvailable(double maxLoanAmountBalanceAvailable) {
        this.maxLoanAmountBalanceAvailable = maxLoanAmountBalanceAvailable;
    }

    public CustomerDirectory getPayeeList() {
        return payeeList;
    }

    public void setPayeeList(CustomerDirectory payeeList) {
        this.payeeList = payeeList;
    }
    
    
    
    @Override
    public String toString() {
        String middleName="";
        if(this.getMiddleName()==null)
        {
           middleName="";
        }
        return this.getFirstName() + " " + middleName + " " + this.getLastName();
    }

}
