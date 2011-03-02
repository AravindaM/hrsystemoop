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
public class RequestCasualLeaveCommand implements Command {

    private Database database;
    private String[] attributesList;

    public RequestCasualLeaveCommand() {
        database = database.getInstance();
        attributesList = new String[]{"Date", "Reason", "Casual Leave Type (0-Full day, 1-Halfday)"};
    }

    /**
     * Adds the new employee to the system
     * @param inputList List of attributes of employee
     * @return Success or Failure
     */
    public void execute(CommandContext context) {
        Map inputList = context.getArgList();

        try {


            int cLeaveType = Integer.valueOf((String) inputList.get("Casual Leave Type (0-Full day, 1-Halfday)"));
            String casLeave;
            switch (cLeaveType) {
                case 0:
                    casLeave = "fullday";
                    break;
                case 1:
                    casLeave = "halfday";
                    break;
                default:
                    casLeave = null;
            }

            CasualLeave cl = new CasualLeave((String) inputList.get("Date"), (String) inputList.get("Reason"), casLeave);
            context.getCurrentuser().getMonthAttendance().addToCasualLeaves(cl);

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
        return "Request Casual Leave";
    }
}
