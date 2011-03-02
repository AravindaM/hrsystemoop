/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

    private Database database;
    private String[] attributesList;

    public RequestAnnualLeaveCommand() {
        database = database.getInstance();
        attributesList = new String[]{"Date", "Reason"};
    }

    /**
     * Adds the new employee to the system
     * @param inputList List of attributes of employee
     * @return Success or Failure
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

    public boolean execute(Map<String, String> argList, Employee currentUser) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        return "Request Annual Leave";
    }
}
