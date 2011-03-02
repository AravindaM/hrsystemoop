/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions.show;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author toshiba
 */
public abstract class ShowSelfCommand implements Command {

    String attribName;

    public ShowSelfCommand(String attributeName) {
        this.attribName = attributeName;
    }

    public void execute(CommandContext context) {
        insertResults(context, context.getCurrentuser());
        context.setReturnStatus(true);
    }

    public String[] getAtrributesList() {
        return new String[0];
    }

    public String getName() {
        return "Show my " + attribName;
    }

    public abstract void insertResults(CommandContext context, Employee currentuser);
}
