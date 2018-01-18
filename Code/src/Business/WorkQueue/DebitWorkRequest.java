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
 */
public class DebitWorkRequest extends WorkRequest {
    
    private String debitWorkRequestID;
    private static int count=0;
    private double debitAmount;
    private Account fromAccount;
    
    public DebitWorkRequest()
    {
        debitWorkRequestID = ("D"+(++count));
    }

    public String getDebitWorkRequestID() {
        return debitWorkRequestID;
    }

    public double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }
    
    
    @Override
    public String toString()
    {
        return this.getDebitWorkRequestID();
    }
    
}
