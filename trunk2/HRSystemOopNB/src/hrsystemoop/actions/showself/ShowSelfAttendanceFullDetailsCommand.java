package hrsystemoop.actions.showself;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.attendancedata.AnnualLeave;
import hrsystemoop.attendancedata.CasualLeave;
import hrsystemoop.attendancedata.Leave;
import hrsystemoop.attendancedata.MedicalLeave;
import hrsystemoop.attendancedata.MonthAttendanceImpl;
import hrsystemoop.modle.Employee;
import java.util.ArrayList;

/**
 *
 * @author R.C.M.Perera
 */
public class ShowSelfAttendanceFullDetailsCommand extends ShowSelfCommand {

    public ShowSelfAttendanceFullDetailsCommand() {
        super("Attendance details");
    }

    @Override
    public void insertResults(CommandContext context, Employee currentuser) {
        MonthAttendanceImpl attendance = currentuser.getMonthAttendance();
        StringBuilder s = new StringBuilder();

        showLeavesType("Annaual Leaves", attendance.getAnnaualLeavesDetails(), s);
        showLeavesType("Casual Leaves", attendance.getCasualLeavesDetails(), s);
        showLeavesType("Medical Leaves", attendance.getMedicalLeavesDetails(), s);

        context.setResults(s.toString());
    }

    private void showLeavesType(String typeName, ArrayList<? extends Leave> leavesDetails, StringBuilder s) {
        s.append(typeName);
        s.append(" :-\n");
        for (Leave leave : leavesDetails) {
            s.append(leave.getLeaveDate());
            s.append("  ");
            s.append(" - ");
            s.append(leave.getReason());
            s.append("\n");
        }

    }
}
