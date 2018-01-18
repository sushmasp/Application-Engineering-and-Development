/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Biller.BillerDirectory;
import Business.Department.Department;
import Business.Region.RegionDirectory;

/**
 *
 * @author kurki
 */
public class Business extends Department{
    
    private static Business business;
    private RegionDirectory regionDirectory;
    private BillerDirectory billerDirectory;
    private LogDirectory logDirectory;
    
    private Business() {
        super(null);
        regionDirectory = new RegionDirectory();
        billerDirectory = new BillerDirectory();
        logDirectory = new LogDirectory();
    }
    
    public static Business getInstance()
    {
        if (business==null)
        {
            business = new Business();
        }
        return business;
    }

    public RegionDirectory getRegionDirectory() {
        return regionDirectory;
    }

    public BillerDirectory getBillerDirectory() {
        return billerDirectory;
    }

    public LogDirectory getLogDirectory() {
        return logDirectory;
    }

    
}
