/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions.show;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.CommandContext;

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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[] getAtrributesList() {
        return new String[0];
    }

    public String getName() {
        return "Show my " + attribName;
    }
}
