/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Region;

import java.util.ArrayList;

/**
 *
 * @author kurki
 */
public class RegionDirectory {
    
    private ArrayList<Region> regionList;
    
    public RegionDirectory()
    {
        regionList = new ArrayList<>();
    }

    public ArrayList<Region> getRegionList() {
        return regionList;
    }
    
    public Region createRegion(String name)
    {
        Region region = new Region(name);
        regionList.add(region);
        return region;
    }
    
    public void removeRegion(Region region)
    {
        regionList.remove(region);
    }
    
   /* public Region createBranch(String name, Region.RegionType type){
        Region region = null;
        if (type == Region.RegionType.NorthEast){
            region = new NorthEastRegion(name);
            regionList.add(region);
        }
        return region;
    }
*/
    
    
}
