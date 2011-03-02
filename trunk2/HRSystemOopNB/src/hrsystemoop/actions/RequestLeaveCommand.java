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
public class RequestLeaveCommand implements Command{

   private Database database;
   private String[] attributesList;

public RequestLeaveCommand(String name, Level level){
    database = database.getInstance();
    attributesList = new String[] {"Username","Designation","Name"};
}

/**
 * Adds the new employee to the system
 * @param inputList List of attributes of employee
 * @return Success or Failure
 */
    public CommandContext execute(CommandContext context) {
        Level newLevel= Level.valueOf(inputList.get("Designation"));
        Employee newEmployee = new EmployeeImpl(inputList.get("Name"), newLevel,inputList.get("username"));
        try {
            database.addEmployee(newEmployee);
            return true;
        } catch (DatabaseExeption ex) {
            return false;
        }
    }

    /**
     * Returns the list of attributes that are needed to add a new employee
     * @return list of required attributes of an employer
     */
    public String[] getAtrributesList() {
        return attributesList;
    }

    public boolean execute(Map<String, String> argList, Employee currentUser) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        return "Add New Employee";
    }

}
