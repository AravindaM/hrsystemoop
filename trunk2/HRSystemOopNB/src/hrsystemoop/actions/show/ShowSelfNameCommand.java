
package hrsystemoop.actions.show;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 */
public class ShowSelfNameCommand extends ShowSelfCommand {

    public ShowSelfNameCommand() {
        super("name");
    }

    @Override
    public void insertResults(CommandContext context, Employee currentuser) {
        context.setResults("your name number is " + currentuser.getName());
    }
}
