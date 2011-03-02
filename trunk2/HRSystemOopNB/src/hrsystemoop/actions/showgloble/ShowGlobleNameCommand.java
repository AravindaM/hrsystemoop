package hrsystemoop.actions.showgloble;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M. Perera
 */
public class ShowGlobleNameCommand extends ShowGlobleCommand {

    public ShowGlobleNameCommand() {
        super("name");
    }

    @Override
    public void insertResults(CommandContext context, Employee employee) {
        context.setResults("Empoyee infomation of id=" + employee.getId() + " : name=" + employee.getName());
    }
}
