package hrsystemoop.actions.show;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
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