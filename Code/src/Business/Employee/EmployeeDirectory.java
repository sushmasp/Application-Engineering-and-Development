/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author kurki
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory()
    {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee addEmployee()
    {
        Employee e = new Employee();
        employeeList.add(e);
        return e;
    }

    public Employee addEmployee(Employee e)
    {
        employeeList.add(e);
        return e;
    }
    
    public void removeEmployee(Employee e)        
    {
        employeeList.remove(e);
    }
    
    public boolean searchEmployee(int employeeID)
    {
        for(Employee e: employeeList)
        {
            if (e.getEmployeeID() == employeeID)
            {
                return true;
            }
        }
        return false;
    }
    
}
