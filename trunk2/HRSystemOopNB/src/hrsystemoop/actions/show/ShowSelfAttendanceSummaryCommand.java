package hrsystemoop.actions.show;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.attendancedata.MonthAttendanceImpl;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 */
public class ShowSelfAttendanceSummaryCommand extends ShowSelfCommand{

    public ShowSelfAttendanceSummaryCommand() {
        super("attendance summary");
    }

    @Override
    public void insertResults(CommandContext context, Employee currentuser) {
        MonthAttendanceImpl attendance = currentuser.getMonthAttendance();
        StringBuilder s = new StringBuilder();
        s.append("Available AnnaulLeaves : ");
        s.append(attendance.getAvailableAnnaulLeaves());
        s.append("\n");
    }

}
