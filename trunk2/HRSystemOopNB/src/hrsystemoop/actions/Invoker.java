
package hrsystemoop.actions;

import java.util.*;
import hrsystemoop.database.*;
import hrsystemoop.database.exeption.*;
import hrsystemoop.modle.Employee;
/**
 *
 * @author Amila Manoj
 * Invoker is responsible for performing any command selected by user
 * The class also provides a list of available commands to the client
 * depending on the logged in user
 */
public class Invoker {
    private Database database;
    private Employee loggedEmployee;
    public Invoker() {
       this.database=Database.getInstance();
    }

    /**
     * Checks if the provided username exists in the database
     * @param username Name of the user to be checked
     * @return true if user exists, false otherwise
     */
    public boolean validateUser(String username){
         try {
            loggedEmployee = database.getEmployee(username);
            return true;
             } catch (DatabaseExeption ex) {

            return false;
        }
    }

    /**
     * See if the provided password matches with the one in database
     * @param password password to be checked
     * @return success or failure
     */
    public boolean validatePassword(String password){

           return loggedEmployee.checkPass(password);
        }

    /**
     * Gets the names of commands that the logged in user can perform. used to
     * display on UI
     * @return List of availableCommands
     */
    public Set<String> getAvailabeCommands(){
        return loggedEmployee.getUserCommands().getAvailabeCommands();
    }

    /**
     * Invokes a selected command using command interface. This method also
     * creates a command context object to further pass attributes and
     * to store return status and return values, if any
     * @param selectedCommandName The name of the command to be performed
     * @param attributes A list of parameters that are needed to execute the
     * particular command. Can be empty. Number of parameters may be different
     * from command to command
     * @return
     */
    public CommandContext perform(String selectedCommandName, HashMap attributes){
        Command selectedCommand = loggedEmployee.getUserCommands().getCommand(selectedCommandName);
        CommandContext context = new CommandContext(loggedEmployee, attributes);
        selectedCommand.execute(context);
        return context;
    }

    /**
     * Gives the required number of parameters that are needed to execute the
     * specified command. 
     * @param selectedCommand The name of the command to be checked
     * @return A String array of parameters. Length varies depending on the
     * selected command. Can also be empty
     */
    public String[] getAttributesForCommand(String selectedCommand) {
        return loggedEmployee.getUserCommands().getCommand(selectedCommand).getAtrributesList();
    }

}
