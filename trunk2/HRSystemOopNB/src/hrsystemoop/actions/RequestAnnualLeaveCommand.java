
package hrsystemoop.actions;

import hrsystemoop.modle.*;
import hrsystemoop.database.*;
import hrsystemoop.attendancedata.*;
import java.util.*;

/**
 *
 * @author Amila Manoj
 */
public class RequestAnnualLeaveCommand implements Command {

    private String[] attributesList;

    public RequestAnnualLeaveCommand() {
        attributesList = new String[]{"Date", "Reason"};
    }

    /**
     * When user requests annual leave, updates the system
     * @param inputList List of attributes for leave
     */
    public void execute(CommandContext context) {
        Map inputList = context.getArgList();

        try {

            AnnualLeave al = new AnnualLeave((String) inputList.get("Date"), (String) inputList.get("Reason"));
            context.getCurrentuser().getMonthAttendance().addToAnnualLeaves(al);

            context.setReturnStatus(true);
        } catch (Exception ex) {
            context.setReturnStatus(false);
        }
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
        return "Request Annual Leave";
    }
}
