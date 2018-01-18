/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Employee.Employee;

/**
 *
 * @author kurki
 */
public class LoanWorkRequest extends WorkRequest{
    
    private String LoanWorkRequestID;
    private static int count=0;
    private Customer customer;
    private Employee employee;
    private double employeeSuggestedLoanAmount;
    private double customeRrequestedLoanAmount;
    private double approvedLoanAmount;
    private double interestRate;
    private String purpose;
    private Boolean isUnderManager;
    
    public LoanWorkRequest()
    {
        LoanWorkRequestID = ("L" + (++count) );
        isUnderManager = false;
    }

    public String getLoanWorkRequestID() {
        return LoanWorkRequestID;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getCustomeRrequestedLoanAmount() {
        return customeRrequestedLoanAmount;
    }

    public void setCustomeRrequestedLoanAmount(double customeRrequestedLoanAmount) {
        this.customeRrequestedLoanAmount = customeRrequestedLoanAmount;
    }

    public double getEmployeeSuggestedLoanAmount() {
        return employeeSuggestedLoanAmount;
    }

    public void setEmployeeSuggestedLoanAmount(double employeeSuggestedLoanAmount) {
        this.employeeSuggestedLoanAmount = employeeSuggestedLoanAmount;
    }
    
    public double getApprovedLoanAmount() {
        return approvedLoanAmount;
    }

    public void setApprovedLoanAmount(double approvedLoanAmount) {
        this.approvedLoanAmount = approvedLoanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }  

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        LoanWorkRequest.count = count;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Boolean getIsUnderManager() {
        return isUnderManager;
    }

    public void setIsUnderManager(Boolean isUnderManager) {
        this.isUnderManager = isUnderManager;
    }
    
    
    
    @Override
    public String toString()
    {
        return String.valueOf(this.getLoanWorkRequestID());
    }
    
}
