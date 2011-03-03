
package hrsystemoop.actions;

import hrsystemoop.modle.*;
import hrsystemoop.database.*;
import java.util.*;

/**
 *
 * @author Amila Manoj
 */
public class AddLoanCommand implements Command {

    private String[] attributesList;

    public AddLoanCommand() {
        attributesList = new String[]{"Loan ID", "Amount", "Borrowed Date", "Due Date", "Loan Duration (Months)"};
    }

    /**
     * Returns the list of attributes that are needed to add a new employee
     * @return list of required attributes of an employer
     */
    public String[] getAtrributesList() {
        return attributesList;
    }

    /**
     * Returns the name of the command to display on UI
     * @return name of the command
     */
    public String getName() {
        return "Add New Loan";
    }

    /**
     * Command to add a loan. performed by HR manager
     * @param context contains parameters and required info to execute command
     */
    public void execute(CommandContext context) {
        Map<String, String> inputList = context.getArgList();
        boolean result=context.getCurrentuser().getLoanProcessor().addLoan(
                inputList.get("Loan ID"),
                Double.valueOf((String) inputList.get("Amount")),
                (String) inputList.get("Borrowed Date"),
                (String) inputList.get("Due Date"),
                Integer.valueOf((String) inputList.get("Loan Duration (Months)")));
        context.setReturnStatus(result);
    }
}
