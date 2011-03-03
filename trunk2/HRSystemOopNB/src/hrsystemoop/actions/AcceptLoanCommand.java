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
    attributesList = new String[] {};
}



    /**
     * Returns the list of attributes that are needed to add a new employee
     * @return list of required attributes of an employer
     */
    public String[] getAtrributesList() {
        return attributesList;
    }

    public String getName() {
        return "Accept Loan";
    }

    /**
     * Command to accept a loan
     * @param context contains parameters and required info to execute command
     */
    public void execute(CommandContext context) {
      //  Employee newEmployee = new EmployeeImpl(context.getArgList().get("Name")
       //         , Level.LEVELTWO, null, null);

    }

}
