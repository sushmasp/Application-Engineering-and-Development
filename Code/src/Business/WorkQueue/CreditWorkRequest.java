/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Account.Account;

/**
 *
 * @author kurki
 * 
 */

public class CreditWorkRequest extends WorkRequest {
    
    private String CreditWorkRequestID;
    private static int count=0;
    private double creditAmount;
    private Account toAccount;
    
    public CreditWorkRequest()
    {
        CreditWorkRequestID = ("C"+(++count));
    }

    public String getCreditWorkRequestID() {
        return CreditWorkRequestID;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }
    
    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    @Override
    public String toString()
    {
        return this.getCreditWorkRequestID();
    }
    
    
    
}
