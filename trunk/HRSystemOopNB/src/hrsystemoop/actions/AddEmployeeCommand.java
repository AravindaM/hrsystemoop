/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

import hrsystemoop.database.Database;
import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.modle.*;
import hrsystemoop.database.*;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amila Manoj
 */
public class AddEmployeeCommand implements Command{

   private Database database;
public AddEmployeeCommand(String name, Level level){
    database = database.getInstance();
}
    public void execute(String argList) {
        Employee newEmployee = new EmployeeImpl(name, level);
        try {
            database.addEmployee(newEmployee);
        } catch (DatabaseExeption ex) {
            
        }
    }

}
