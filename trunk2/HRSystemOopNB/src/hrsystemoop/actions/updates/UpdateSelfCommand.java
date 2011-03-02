/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions.updates;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.CommandContext;
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

    public CommandContext execute(CommandContext context) {
        throw new UnsupportedOperationException("Not supported yet.");
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
