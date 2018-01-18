/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author kurki
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory()
    {
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer addCustomer()
    {
        Customer c = new Customer();
        customerList.add(c);
        return c;
    }
    
    public void addCustomer(Customer c)
    {
        customerList.add(c);
    }
    
    public void removeCustomer(Customer c)
    {
        customerList.remove(c);
    }
    
    public Customer searchCustomer(int customerID)
    {
        for(Customer c: customerList)
        {
            if(c.getCustomerID()==customerID)
            {
                return c;
            }
        }
        return null;
    }
    
}
