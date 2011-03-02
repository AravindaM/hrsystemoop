/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions;

import hrsystemoop.database.exeption.*;
import hrsystemoop.modle.*;
import hrsystemoop.database.*;
import java.util.*;

/**
 *
 * @author Amila Manoj
 */
public class AddEmployeeCommand implements Command {

    private Database database;
    private String[] attributesList;

    public AddEmployeeCommand() {
        database = database.getInstance();
        attributesList = new String[]{"Username","Password", "Designation(0-HRManager,1-HRAssistant,2-OtherEmployee)", "Level(0-5)", "Name"};
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
        Map<String, String> inputList = context.getArgList();
        Level newLevel = Level.parseInt(Integer.valueOf(inputList.get("Level(0-5)")));
        int empType = Integer.parseInt(inputList.get("Designation(0-HRManager,1-HRAssistant,2-OtherEmployee)"));
        EmployeeImpl newEmployee = null;
        switch (empType) {
            case 0:
                newEmployee = new HRManagerImpl(inputList.get("Name"),
                        newLevel, inputList.get("Username"), inputList.get("Password"));
                break;
            case 1:
                newEmployee = new HRAssistantImpl(inputList.get("Name"),
                        newLevel, inputList.get("Username"), inputList.get("Password"));
                break;
            case 2:
                newEmployee = new EmployeeImpl(inputList.get("Name"),
                        newLevel, inputList.get("Username"), inputList.get("Password"));
                break;
            default:
                context.setReturnStatus(false);
                break;
        }

        if (newEmployee != null) {
            try {
                database.addEmployee(newEmployee);
                context.setReturnStatus(true);
            } catch (DatabaseExeption ex) {
                context.setReturnStatus(false);
            }
        }
    }

    public String getName() {
        return "Add New Employee";
    }
}
