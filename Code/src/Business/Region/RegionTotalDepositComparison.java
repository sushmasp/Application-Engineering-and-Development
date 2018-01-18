/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Region;

import java.util.Comparator;

/**
 *
 * @author kurki
 */
public class RegionTotalDepositComparison implements Comparator<Region>{

    @Override
    public int compare(Region r1, Region r2) {
        String r1value = String.valueOf(r2.getTotalDeposit());
        String r2Value = String.valueOf(r1.getTotalDeposit());
        return r2Value.compareTo(r1value);
    }
}
