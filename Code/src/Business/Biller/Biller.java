/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Biller;

import Business.Account.AccountDirectory;
import Business.Demographics.Person;

/**
 *
 * @author kurki
 */
public class Biller extends Person{
    
    private static int count=1;
    private int billerID;
    private String name;
    private AccountDirectory accountDirectory;
    
    public Biller()
    {
        billerID = ++count;
        accountDirectory = new AccountDirectory();
    }

    public int getBillerID() {
        return billerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }
    
    @Override
    public String toString()
    {
        return this.name;
    }
}
