/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions.updates;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.CommandContext;
import hrsystemoop.database.Database;
import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 */
public abstract class UpdateSelfCommand implements Command {

    String attribute;

    public UpdateSelfCommand(String attribute) {
        this.attribute = attribute;
    }

    public void execute(CommandContext context) {
        update(context.getArgList().get(attribute), context.getCurrentuser());
        try {
            Database.getInstance().updateEmployee(context.getCurrentuser().getId(), context.getCurrentuser());
            context.setResults(attribute + " changed");
            context.setReturnStatus(true);
        } catch (DatabaseExeption ex) {
            context.setReturnStatus(false);
            System.out.println("can't change " + attribute + " : " + ex.getMessage());
        }
    }

    public String[] getAtrributesList() {
        return new String[]{"change " + attribute};
    }

    public String getName() {
        return "Chnage my " + attribute;
    }

    public abstract void update(String attribValue, Employee currentUser);
}
