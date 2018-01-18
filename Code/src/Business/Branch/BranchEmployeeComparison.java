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
public class BranchEmployeeComparison implements Comparator<Branch>{

    @Override
    public int compare(Branch b1, Branch b2) {
       return b2.getEmployeeCount() - b1.getEmployeeCount();
    }
}
