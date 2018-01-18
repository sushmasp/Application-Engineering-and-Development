/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Region;

import Business.Account.Account;
import Business.Branch.Branch;
import Business.Branch.BranchDirectory;
import Business.Customer.Customer;
import Business.Department.Department;
import Business.Employee.Employee;

/**
 *
 * @author kurki
 */
public class Region extends Department implements Comparable<Region>{
    
    //private RegionType regionType;
    private String regionName;
    private BranchDirectory branchDirectory;
    private int employeeCount;
    private int customerCount;
    private double totalDeposit;
    private double totalLoanIssued;
    
    public Region(String name/*,RegionType regionType*/)
    {
        super(name);
        branchDirectory = new BranchDirectory();
        /*this.regionType = regionType;*/
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    public BranchDirectory getBranchDirectory() {
        return branchDirectory;
    }

    public void setBranchDirectory(BranchDirectory branchDirectory) {
        this.branchDirectory = branchDirectory;
    }
    
    
    
    @Override
    public String toString()
    {
        return this.regionName;
    }

    public int getCustomerCount()
    {
        int thisCount = 0;
        //To find the total customer count of this Region
        if(!(this.getBranchDirectory().getBranchList().isEmpty()))
                {
                    for(Branch b:this.getBranchDirectory().getBranchList())
                    {
                        if(!(b.getCustomerDirectory().getCustomerList().isEmpty()))
                        {
                            for(Customer c: b.getCustomerDirectory().getCustomerList())
                                {
                                  thisCount = ++thisCount;
                                  
                                }
                        }
                    }
                }
        customerCount = thisCount;
        return customerCount;
    }
    
    public int getEmployeeCount()
    {
        int thisCount = 0;
        //To find the total employee count of this Region
        if(!(this.getBranchDirectory().getBranchList().isEmpty()))
                {
                    for(Branch b:this.getBranchDirectory().getBranchList())
                    {
                        if(!(b.getDepartmentDirectory().getDepartmentList().isEmpty()))
                        {
                            for(Department d: b.getDepartmentDirectory().getDepartmentList())
                                {
                                    if(!(d.getEmployeeDirectory().getEmployeeList().isEmpty()))
                                    {
                                        for(Employee e : d.getEmployeeDirectory().getEmployeeList())
                                        {
                                            thisCount = ++thisCount;
                                        }
                                        
                                    }   
                                  
                                }
                        }
                    }
                }
        employeeCount = thisCount;
        return employeeCount;
    }

    public double getTotalDeposit() {
        double thisDeposit = 0;
        //To find the total deposit  of this Region
        if(!(this.getBranchDirectory().getBranchList().isEmpty()))
                {
                    for(Branch b:this.getBranchDirectory().getBranchList())
                    {
                        if(!(b.getCustomerDirectory().getCustomerList().isEmpty()))
                        {
                            for(Customer c: b.getCustomerDirectory().getCustomerList())
                                {
                                    for(Account a:c.getAccountDirectory().getAccountList())
                                    {
                                        thisDeposit = thisDeposit+a.getAccountBalance();
                                    }
                                }
                        }
                    }
                }
        totalDeposit = thisDeposit;
        return totalDeposit;
    }

    public double getTotalLoanIssued() {
        double thisTotalLoanIssued = 0;
        double thisTotalLoanEligible = 0;
        int thistotalCount=0;
        //To find the total loan issued  of this Region
        if(!(this.getBranchDirectory().getBranchList().isEmpty()))
                {
                    for(Branch b:this.getBranchDirectory().getBranchList())
                    {
                        if(!(b.getCustomerDirectory().getCustomerList().isEmpty()))
                        {
                            for(Customer c: b.getCustomerDirectory().getCustomerList())
                                {
                                    thistotalCount = ++thistotalCount;
                                    thisTotalLoanEligible = thisTotalLoanEligible +c.getMaxLoanAmountBalanceAvailable();
                                }
                        }
                    }
                }
        thisTotalLoanIssued = ((thistotalCount)*(10000)) - (thisTotalLoanEligible);
        totalLoanIssued = thisTotalLoanIssued;
        return totalLoanIssued;
    }
    
    
    

    @Override
    public int compareTo(Region r) {
        return  r.getCustomerCount()-this.getCustomerCount();
    }
    
}
