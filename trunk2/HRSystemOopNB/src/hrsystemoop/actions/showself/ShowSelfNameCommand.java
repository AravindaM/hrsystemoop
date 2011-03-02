
package hrsystemoop.actions.showself;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 * @author Amila Manoj
 */
public class ShowSelfNameCommand extends ShowSelfCommand {

    public ShowSelfNameCommand() {
        super("name");
    }

    @Override
    public void insertResults(CommandContext context, Employee currentuser) {
        context.setResults("your name is " + currentuser.getName());
    }
}
