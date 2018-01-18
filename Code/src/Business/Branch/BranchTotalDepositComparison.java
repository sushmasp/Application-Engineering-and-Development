/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Branch;

import java.util.Comparator;

/**
 *
 * @author kurki
 */
public class BranchTotalDepositComparison implements Comparator<Branch>{

    @Override
    public int compare(Branch b1, Branch b2) {
        String r1value = String.valueOf(b2.getTotalDeposit());
        String r2Value = String.valueOf(b1.getTotalDeposit());
        return r2Value.compareTo(r1value);
    }
}
