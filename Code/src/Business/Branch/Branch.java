/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Branch;

import Business.Account.Account;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Department.Department;
import Business.Department.DepartmentDirectory;
import Business.Employee.Employee;

/**
 *
 * @author kurki
 */
public abstract class Branch extends Department implements Comparable<Branch>{
    
    private DepartmentDirectory departmentDirectory;
    private CustomerDirectory customerDirectory; 
    private BranchType branchType;
    private String branchName;
    private int employeeCount;
    private int customerCount;
    private double totalDeposit;
    private double totalLoanIssued;
    
    public Branch(String name,BranchType type) {
        super(name);
        this.branchType = type;
        this.branchName =name;
        departmentDirectory = new DepartmentDirectory();
        customerDirectory = new CustomerDirectory();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    
    public enum BranchType{
        BofA("BofA Bank");
        
        private String value;

        private BranchType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public DepartmentDirectory getDepartmentDirectory() {
        return departmentDirectory;
    }

    public BranchType getBranchType() {
        return branchType;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    
    
    @Override
    public String toString()
    {
        return this.branchName;
    }
    
    public int getCustomerCount()
    {
        int thisCount = 0;
        //To find the total customer count of this Branch

    if(!(this.getCustomerDirectory().getCustomerList().isEmpty()))
    {
      for(Customer c: this.getCustomerDirectory().getCustomerList())
       {
         thisCount = ++thisCount;
                                  
        }
    }
            
        customerCount = thisCount;
        return customerCount;
    }
    
    public int getEmployeeCount()
    {
        int thisCount = 0;
        //To find the total employee count of this Branch
     
    if(!(this.getDepartmentDirectory().getDepartmentList().isEmpty()))
      {
        for(Department d: this.getDepartmentDirectory().getDepartmentList())
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
                    
        employeeCount = thisCount;
        return employeeCount;
    }

    public double getTotalDeposit() {
        double thisDeposit = 0;
        //To find the total deposit  of this Branch
        
       if(!(this.getCustomerDirectory().getCustomerList().isEmpty()))
        {
         for(Customer c: this.getCustomerDirectory().getCustomerList())
           {
             for(Account a:c.getAccountDirectory().getAccountList())
              {
                thisDeposit = thisDeposit+a.getAccountBalance();
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
        //To find the total loan issued  of this Branch
        
         if(!(this.getCustomerDirectory().getCustomerList().isEmpty()))
          {
            for(Customer c: this.getCustomerDirectory().getCustomerList())
             {
              thistotalCount = ++thistotalCount;
              thisTotalLoanEligible = thisTotalLoanEligible +c.getMaxLoanAmountBalanceAvailable();
             }
          }
                
        thisTotalLoanIssued = ((thistotalCount)*(10000)) - (thisTotalLoanEligible);
        totalLoanIssued = thisTotalLoanIssued;
        return totalLoanIssued;
    }
    
}
