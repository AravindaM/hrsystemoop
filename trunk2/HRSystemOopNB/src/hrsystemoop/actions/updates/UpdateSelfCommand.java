/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions.updates;

import hrsystemoop.actions.Command;
import hrsystemoop.database.Database;
import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.modle.Employee;
import java.util.Map;

/**
 *
 * @author R.C.M.Perera
 */
public abstract class UpdateSelfCommand implements Command {

    String attribute;

    public UpdateSelfCommand(String attribute) {
        this.attribute = attribute;
    }

    public boolean execute(Map<String, String> argList, Employee currentUser) {
        update(argList.get(attribute), currentUser);
        try {
            Database.getInstance().updateEmployee(currentUser.getId(), currentUser);
            return true;
        } catch (DatabaseExeption ex) {
            System.out.println("can't change " + attribute + " : " + ex.getMessage());
            return false;
        }
    }

    public String[] getAtrributesList() {
        return new String[]{"change " + attribute};
    }

    public String getName() {
        return attribute;
    }

    public abstract void update(String attribValue, Employee currentUser);

    public static class UpdateNameCommand extends UpdateSelfCommand {

        public UpdateNameCommand() {
            super("name");
        }

        @Override
        public void update(String attribValue, Employee currentUser) {
            currentUser.setName(attribValue);
        }
    }
}
