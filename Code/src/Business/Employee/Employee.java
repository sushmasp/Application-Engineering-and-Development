/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Demographics.Person;

/**
 *
 * @author kurki
 */
public class Employee extends Person {
    
    private static int count=0;
    private int employeeID;
    
    public Employee()
    {
        employeeID = ++count;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    
    @Override
    public String toString() {
        String middleName="";
        if(this.getMiddleName()==null)
        {
           middleName="";
        }
        return this.getFirstName() + " " + middleName + " " + this.getLastName();
    }
}
