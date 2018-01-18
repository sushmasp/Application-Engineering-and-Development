/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author kurki
 */
public class LogDirectory {
    
    private ArrayList<Log> logList;
    
    public LogDirectory()
    {
        logList = new ArrayList<>();
    }

    public ArrayList<Log> getLogList() {
        return logList;
    }
    
    public Log addLog()
    {
        Log log= new Log();
        logList.add(log);
        return log;
    }
    
    public void addLog(Log log)
    {
        logList.add(log);
    }
    
}
