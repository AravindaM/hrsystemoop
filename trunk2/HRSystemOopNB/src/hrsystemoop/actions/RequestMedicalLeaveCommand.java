
package hrsystemoop.actions;

import hrsystemoop.modle.*;
import hrsystemoop.database.*;
import hrsystemoop.attendancedata.*;
import java.util.*;

/**
 *
 * @author Amila Manoj
 */
public class RequestMedicalLeaveCommand implements Command {

    private Database database;
    private String[] attributesList;

    public RequestMedicalLeaveCommand() {
        database = database.getInstance();
        attributesList = new String[]{ "Date", "Reason", "End Date"};
    }

    /**
     * When user requests medical leave, updates the system
     * @param inputList List of attributes for leave
     */
    public void execute(CommandContext context) {
        Map inputList = context.getArgList();

        try {

            MedicalLeave ml = new MedicalLeave((String) inputList.get("Date"), (String) inputList.get("Reason"), (String) inputList.get("End Date"));
            context.getCurrentuser().getMonthAttendance().addToMedicalLeaves(ml);

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
        return "Request Medical Leave";
    }
}
