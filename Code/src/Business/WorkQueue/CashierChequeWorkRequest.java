/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Account.Account;
import Business.Customer.Customer;

/**
 *
 * @author kurki
 */
public class CashierChequeWorkRequest extends WorkRequest{
    
    private String cashierChequeRequestID;
    private static int count=0;
    private double amount;
    private String toPerson;
    
   public  CashierChequeWorkRequest()
   {
       cashierChequeRequestID = ("CC" + (++count));
   }
    
    public String getCashierChequeRequestID() {
        return cashierChequeRequestID;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getToPerson() {
        return toPerson;
    }

    public void setToPerson(String toPerson) {
        this.toPerson = toPerson;
    }
    
    @Override
    public String toString()
    {
        return this.getCashierChequeRequestID();
    }
    
    
}
