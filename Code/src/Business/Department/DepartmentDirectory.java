/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Department.Department.DepartmentType;
import java.util.ArrayList;

/**
 *
 * @author kurki
 */
public class DepartmentDirectory {
    
    private ArrayList<Department> departmentList;
    
    public DepartmentDirectory()
    {
        departmentList = new ArrayList<>();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }
    
     public Department createDepartment(DepartmentType type){
        Department department = null;
        if (type.getValue().equals(DepartmentType.CustomerServiceDepartment.getValue()))
        {
            department = new CustomerServiceDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(DepartmentType.LoanDepartment.getValue()))
        {
            department = new LoanDepartment();
            departmentList.add(department);
        }
        else if (type.getValue().equals(DepartmentType.SecurityDepartment.getValue())){
            department = new SecurityDepartment();
            departmentList.add(department);
        }
        return department;
    }
    
}
