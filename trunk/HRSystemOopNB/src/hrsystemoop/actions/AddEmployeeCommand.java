/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

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
public class AddEmployeeCommand implements Command{

   private Database database;
   private ArrayList<String> attributesList;
public AddEmployeeCommand(String name, Level level){
    database = database.getInstance();
    attributesList = new ArrayList<String>();
    attributesList.add("Username");
    attributesList.add("Designation");
    attributesList.add("Name");
}

/**
 * Adds the new employee to the system
 * @param inputList List of attributes of employee
 * @return Success or Failure
 */
    public boolean execute(Map<String,String> inputList) {
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
    public ArrayList<String> getAtrributesList() {
        return attributesList;
    }

}
