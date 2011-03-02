/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

import hrsystemoop.modle.*;
import hrsystemoop.database.*;


/**
 *
 * @author Amila Manoj
 */
public class AcceptLoanCommand implements Command{

   private Database database;
   private String[] attributesList;

public AcceptLoanCommand(){
    database = database.getInstance();
    attributesList = new String[] {"Username","Designation","Name"};
}

/**
 * Adds the new employee to the system
 * @param inputList List of attributes of employee
 * @return Success or Failure
 */


    /**
     * Returns the list of attributes that are needed to add a new employee
     * @return list of required attributes of an employer
     */
    public String[] getAtrributesList() {
        return attributesList;
    }

    public String getName() {
        return "Add New Employee";
    }

    public void execute(CommandContext context) {
        Employee newEmployee = new EmployeeImpl(context.getArgList().get("Name")
                , Level.LEVELTWO, null, null);

    }

}
