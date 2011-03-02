/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

import hrsystemoop.database.*;
import hrsystemoop.modle.*;
import java.util.*;
/**
 *
 * @author TOSHIBA
 */
public class CommandContext {
    Employee currentuser;
    Map<String,String> argList;
    String[] results;
    boolean returnStatus;

    public CommandContext(Employee currentuser, Map<String, String> argList) {
        this.currentuser = currentuser;
        this.argList = argList;
        this.returnStatus=false;
    }

    public Map<String, String> getArgList() {
        return argList;
    }

    public Employee getCurrentuser() {
        return currentuser;
    }

    public void setReturnStatus(boolean returnStatus) {
        this.returnStatus = returnStatus;
    }

    public void printResults(){
        
    }

    public void setResults(String[] results) {
        this.results = results;
    }
}
