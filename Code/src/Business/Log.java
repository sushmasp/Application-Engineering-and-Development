/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Branch.Branch;
import Business.Department.Department;
import Business.Region.Region;
import Business.UserAccount.UserAccount;

/**
 *
 * @author kurki
 */
public class Log {
    private static int count =0;
    private int logID;
    private String name;
    private String role;
    private int IPAddress;
    private String time;
    private String Message;
    private Region region;
    private Branch branch;
    private Department department;
    
    public Log()
    {
        logID = ++count;
    }

    public int getLogID() {
        return logID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setIPAddress(int IPAddress) {
        this.IPAddress = IPAddress;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getIPAddress() {
        return IPAddress;
    }

    public String getTime() {
        return time;
    }

    public String getMessage() {
        return Message;
    }
    
    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public String toString()
    {
        return this.name;
    }
    
    
}
