/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Account;

/**
 *
 * @author kurki
 */
public class SavingsAccount extends Account{
    
    private static int count=1000;
     
    public SavingsAccount() {
        super(Account.AccountType.SavingsAccount.getValue(),String.valueOf("SA"+(++count)));
    }
    
}
