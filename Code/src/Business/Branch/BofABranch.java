/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Branch;

/**
 *
 * @author kurki
 */
public class BofABranch  extends Branch {
    
    public BofABranch(String name) {
        super(name, BranchType.BofA);
    }

    @Override
    public int compareTo(Branch b) {
       return  b.getCustomerCount()-this.getCustomerCount();
    }
    
}
