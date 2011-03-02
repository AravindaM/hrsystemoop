/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions.show;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author toshiba
 */
public class ShowSelfIDCommand extends ShowSelfCommand {

    public ShowSelfIDCommand() {
        super("id");
    }

    @Override
    public void insertResults(CommandContext context, Employee currentuser) {
        context.setResults("your id number is " + currentuser.getId());
    }
}
