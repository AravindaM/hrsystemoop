/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions.showgloble;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.CommandContext;
import hrsystemoop.database.Database;
import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M. Perera
 */
public abstract class ShowGlobleCommand implements Command {

    String attribName;
    private final static String EMPLOYEE_ID = "empoyee id";

    public ShowGlobleCommand(String attributeName) {
        this.attribName = attributeName;
    }

    public void execute(CommandContext context) {

        try {
            int id = Integer.parseInt(context.getArgList().get(EMPLOYEE_ID));
            try {
                Employee employee = Database.getInstance().getEmployee(id);
                insertResults(context, employee);
                context.setReturnStatus(true);
            } catch (DatabaseExeption ex) {
                context.setReturnStatus(false);
                context.setResults("can't show empoyee who's id=" + id + " : " + ex.getMessage());
            }
        } catch (NumberFormatException numberFormatException) {
            context.setReturnStatus(false);
            context.setResults("please insert an integer");
        }

    }

    public String[] getAtrributesList() {
        return new String[]{EMPLOYEE_ID};
    }

    public String getName() {
        return "Show Employee " + attribName;
    }

    public abstract void insertResults(CommandContext context, Employee employee);
}
