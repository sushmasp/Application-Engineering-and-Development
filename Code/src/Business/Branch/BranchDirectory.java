/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Branch;

import java.util.ArrayList;

/**
 *
 * @author kurki
 */
public class BranchDirectory {
    
    private ArrayList<Branch> branchList;
    
    public BranchDirectory()
    {
        branchList = new ArrayList<>();
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }
    
    public Branch createBranch(String name, Branch.BranchType type){
        Branch branch = null;
        if (type == Branch.BranchType.BofA)
        {
            branch = new BofABranch(name);
            branchList.add(branch);
        }
        return branch;
    }
    
    public void deleteBranch(Branch branch)
    {
        branchList.remove(branch);
    }
    
}
