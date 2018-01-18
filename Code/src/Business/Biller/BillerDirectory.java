/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Biller;

import java.util.ArrayList;

/**
 *
 * @author kurki
 */
public class BillerDirectory {
    
    private ArrayList<Biller> billerList;
    
    public BillerDirectory()
    {
        billerList = new ArrayList<>();
    }

    public ArrayList<Biller> getBillerList() {
        return billerList;
    }

    public Biller addBiller()
    {
        Biller b = new Biller();
        billerList.add(b);
        return b;
    }
    
    public void removeBiller(Biller b)
    {
        billerList.remove(b);
    }
    
    public Biller searchBiller(int ID)
    {
        for(Biller b:billerList)
        {
            if(b.getBillerID()==ID)
            {
                return b;
            }
        }
        return null;
    }
    
    
    
}
