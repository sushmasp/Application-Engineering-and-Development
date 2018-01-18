/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author kurki
 */
public abstract class Department {
     
    private static int counter = 0;
    private int departmentID;
    private String departmentName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private String deptType;
  
    
    public Department(String name)
    {
        departmentID = ++counter;
        departmentName = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
       
    }
    
    public enum DepartmentType{
        CustomerServiceDepartment("Customer Service Department"),
        LoanDepartment("Loan Department"),
        SecurityDepartment("Security Department");
        
        private String value;
        private DepartmentType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getDepartmentID() {
        return departmentID;
    }
    @Override
    public String toString()
    {
        return this.departmentName;
    }
    
    
}
