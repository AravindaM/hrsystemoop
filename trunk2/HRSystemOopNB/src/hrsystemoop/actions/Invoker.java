
package hrsystemoop.actions;

import java.util.*;
import hrsystemoop.database.*;
import hrsystemoop.database.exeption.*;
import hrsystemoop.modle.Employee;
/**
 *
 * @author Amila Manoj
 */
public class Invoker {
    private Database database;
    private Employee loggedEmployee;
    public Invoker() {
       this.database=Database.getInstance();
    }

    public boolean validateUser(String username){
         try {
            loggedEmployee = database.getEmployee(username);
            return true;
             } catch (DatabaseExeption ex) {

            return false;
        }
    }

    public boolean validatePassword(String password){

           return loggedEmployee.checkPass(password);
        }

    public Set<String> getAvailabeCommands(){
        return loggedEmployee.getUserCommands().getAvailabeCommands();
    }

    public void perform(String selectedCommandName, HashMap attributes){
        Command selectedCommand = loggedEmployee.getUserCommands().getCommand(selectedCommandName);
        selectedCommand.execute(attributes, loggedEmployee);
    }

    public String[] getAttributesForCommand(String selectedCommand) {
        return loggedEmployee.getUserCommands().getCommand(selectedCommand).getAtrributesList();
    }

}
