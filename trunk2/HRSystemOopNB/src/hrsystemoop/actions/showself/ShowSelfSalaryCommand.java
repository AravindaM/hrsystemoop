package hrsystemoop.actions.showself;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 */
public class ShowSelfSalaryCommand extends ShowSelfCommand {

    public ShowSelfSalaryCommand() {
        super("monthly salary");
    }

    @Override
    public void insertResults(CommandContext context, Employee currentuser) {
        context.setResults("your monthly salary for this month is " + currentuser.getSalary());
    }
}
