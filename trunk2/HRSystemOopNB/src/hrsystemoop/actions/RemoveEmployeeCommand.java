/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

import hrsystemoop.modle.Level;
import hrsystemoop.*;
import hrsystemoop.database.Database;
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
   private ArrayList<String> attributesList;
public RemoveEmployeeCommand(String name, Level level){
    database = database.getInstance();
    attributesList = new ArrayList<String>();
    attributesList.add("Emplyee id");
}

/**
 * Removes the specified employee from the system
 * @param inputList List of attributes of employee
 * @return Success or Failure
 */
    public boolean execute(Map<String,String> inputList) {

        int id =Integer.getInteger(inputList.get("Emplyee id"));
        try {
            database.deleteEmployee(id);
            return true;
        } catch (DatabaseExeption ex) {
            return false;
        }
    }

    /**
     * Returns the list of attributes that are needed to remove the employee
     * @return list of required attributes of an employer
     */
    public ArrayList<String> getAtrributesList() {
        return attributesList;
    }

}
