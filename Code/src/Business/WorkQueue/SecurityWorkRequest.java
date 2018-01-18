/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.LogDirectory;

/**
 *
 * @author kurki
 */
public class SecurityWorkRequest extends WorkRequest {
    
    private String SecurityWorkRequestID;
    private static int count=0;
    private LogDirectory logDirectory;
    private String suggestions;
    
    public SecurityWorkRequest()
    {
        SecurityWorkRequestID = ("S"+(++count));
        logDirectory = new LogDirectory();
    }

    public String getSecurityWorkRequestID() {
        return SecurityWorkRequestID;
    }

    public LogDirectory getLogDirectory() {
        return logDirectory;
    }

    public void setLogDirectory(LogDirectory logDirectory) {
        this.logDirectory = logDirectory;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }
    
    @Override
    public String toString()
    {
        return this.getSecurityWorkRequestID();
    }

    
    
}
