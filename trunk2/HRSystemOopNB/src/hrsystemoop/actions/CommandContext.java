/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

import hrsystemoop.modle.*;
import java.util.*;
/**
 *
 * @author Amila Manoj
 * stores the attributes needed to execute commands and results after executing
 */
public class CommandContext {
    private Employee currentuser;
    private Map<String,String> argList;
    private String results;
    private boolean returnStatus;

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

  public boolean getReturnStatus() {
        return returnStatus;
    }

    public String getResults(){
        return results.toString();
    }

    public void setResults(String results) {
        this.results = results;
    }
}
