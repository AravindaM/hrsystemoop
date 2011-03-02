/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.modle.*;
import hrsystemoop.database.*;
import java.util.*;


/**
 *
 * @author Amila Manoj
 */
public class RemoveEmployeeCommand implements Command{

   private Database database;
   private String[] attributesList;
public RemoveEmployeeCommand(){
    database = database.getInstance();

    attributesList = new String[] {"Emplyee id"};
   
}

/**
 * Removes the specified employee from the system
 * @param inputList List of attributes of employee
 * @return Success or Failure
 */
    public void execute(CommandContext context) {

        int id =Integer.getInteger(context.getArgList().get("Emplyee id"));
        try {
            database.deleteEmployee(id);
            context.setReturnStatus(true);
        } catch (DatabaseExeption ex) {
            context.setReturnStatus(false);
        }
    }

    /**
     * Returns the list of attributes that are needed to remove the employee
     * @return list of required attributes of an employer
     */
    public String[] getAtrributesList() {
        return  attributesList;
    }

    public boolean execute(Map<String, String> argList, Employee currentUser) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public String getName() {
        return "Remove Employee";
    }

}
