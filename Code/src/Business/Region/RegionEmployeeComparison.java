/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Region;

import java.util.Comparator;

/**
 *
 * @author kurki
 */
public class RegionEmployeeComparison implements Comparator<Region>{

    @Override
    public int compare(Region r1, Region r2) {
       return r2.getEmployeeCount() - r1.getEmployeeCount();
    }

    
    
}
