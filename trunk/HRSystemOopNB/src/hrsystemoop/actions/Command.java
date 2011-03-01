/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;
import java.util.*;
/**
 *
 * @author Amila Manoj
 */
/* The Command interface */
public interface Command {
    
     /**
     * Executes the appropriate sequence of actions
     * depending on the implemented commands
      * @param argList passes arguments needed to complete the action, if any
     */
    public boolean execute(Map<String,String> argList);

    /**
     * Returns the set of attributes that user need to input to perform
     * a particular command
     * @return array of attributes that is requead to execute 
     */
    public String[] getAtrributesList();

    public String getName();
}
