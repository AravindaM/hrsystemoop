/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

import hrsystemoop.modle.*;
import hrsystemoop.*;
import hrsystemoop.database.*;
import hrsystemoop.database.exeption.*;
import hrsystemoop.modle.*;
import hrsystemoop.database.*;
import java.util.*;


/**
 *
 * @author Amila Manoj
 */
public class AddEmployeeCommand implements Command{

   private Database database;
   private String[] attributesList;

public AddEmployeeCommand(){
    database = database.getInstance();
    attributesList = new String[] {"Username","Designation","Name"};
}




    /**
     * Returns the list of attributes that are needed to add a new employee
     * @return list of required attributes of an employer
     */
    public String[] getAtrributesList() {
        return attributesList;
    }

    /**
 * Adds the new employee to the system and updates the context with result status
 * @param context context containing required info
 * @return none
 */
    public void execute(CommandContext context) {
                Map<String,String> inputList = context.getArgList();
        Level newLevel= Level.valueOf(inputList.get("Designation"));
        EmployeeImpl newEmployee = new EmployeeImpl(inputList.get("Name"), newLevel,inputList.get("Username"), inputList.get("Password"));
        try {
            database.addEmployee(newEmployee);
            context.setReturnStatus(true);
        } catch (DatabaseExeption ex) {
            context.setReturnStatus(false);
        }
    }

    public String getName() {
        return "Add New Employee";
    }

}
