package hrsystemoop.actions.showself;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 */
public class ShowSelfUserNameCommand extends ShowSelfCommand {

    public ShowSelfUserNameCommand() {
        super("user name");
    }

    @Override
    public void insertResults(CommandContext context, Employee currentuser) {
        context.setResults("your id user name is " + currentuser.getUserName());
    }
}
