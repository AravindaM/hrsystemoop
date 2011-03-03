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

    /**
     * Returns the Arguments list of the associated command along with user's
     * response
     * @return A Map of parameters and user responses, each matching to
     * parameters
     */
    public Map<String, String> getArgList() {
        return argList;
    }

    /**
     * Returns the user associated with the command for further processing
     * if required by the command
     * @return Associated user
     */
    public Employee getCurrentuser() {
        return currentuser;
    }

    /**
     * Sets the success or failure of the command after executing
     * Set by the specific command
     * @param returnStatus True or false
     */
    public void setReturnStatus(boolean returnStatus) {
        this.returnStatus = returnStatus;
    }

    /**
     * Gives the success or failure of the associated command
     * @return True or false, depending on the results, default is false
     */
  public boolean getReturnStatus() {
        return returnStatus;
    }

  /**
   * Returns the set of result of the associated command, if any
   * @return String representation of results
   */
    public String getResults(){
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
}
