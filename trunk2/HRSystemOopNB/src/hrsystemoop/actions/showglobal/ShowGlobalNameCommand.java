package hrsystemoop.actions.showglobal;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M. Perera
 */
public class ShowGlobalNameCommand extends ShowGlobalCommand {

    public ShowGlobalNameCommand() {
        super("name");
    }

    @Override
    public void insertResults(CommandContext context, Employee employee) {
        context.setResults("Empoyee infomation of id=" + employee.getId() + " : name=" + employee.getName());
    }
}
