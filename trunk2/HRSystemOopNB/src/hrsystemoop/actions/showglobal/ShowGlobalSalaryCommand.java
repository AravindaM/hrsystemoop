package hrsystemoop.actions.showglobal;

import hrsystemoop.actions.showself.*;
import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 */
public class ShowGlobalSalaryCommand extends ShowSelfCommand {

	public ShowGlobalSalaryCommand() {
		super("monthly salary");
	}

	@Override
	public void insertResults(CommandContext context, Employee currentuser) {
		context.setResults("Infomation of the employee who's id=" + currentuser.getId() + "/n/t monthly salary for this month is " + currentuser.getSalary());
	}
}
