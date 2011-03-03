package hrsystemoop.actions.showglobal;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.attendancedata.MonthAttendanceImpl;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 */
public class ShowGlobalAttendanceSummaryCommand extends ShowGlobalCommand {

    public ShowGlobalAttendanceSummaryCommand() {
        super("attendance summary");
    }

    @Override
    public void insertResults(CommandContext context, Employee employee) {

        MonthAttendanceImpl attendance = employee.getMonthAttendance();
        StringBuilder s = new StringBuilder();
        s.append("attendance summary of the Employee who's id ").append(employee.getId());

        s.append("\nAvailable Annaul Leaves : ");
        s.append(attendance.getAvailableAnnaulLeaves());
        s.append("\n");


        s.append("Available Casual Leaves : ");
        s.append(attendance.getAvailableCasualLeaves());
        s.append("\n");

        s.append("Available Medical Leaves : ");
        s.append(attendance.getAvailableMedicalLeaves());
        s.append("\n");

        s.append("Total Anaual Leaves Taken: ");
        s.append(attendance.getTotalAnaualLeaves());
        s.append("\n");

        s.append("Total Casual Leaves Taken: ");
        s.append(attendance.getTotalCasualLeaves());
        s.append("\n");

        s.append("Total Medical Leaves Taken: ");
        s.append(attendance.getTotalMedicalLeaves());
        s.append("\n");

        s.append("Total Leaves Taken: ");
        s.append(attendance.getTotalLeaves());
        s.append("\n");

        s.append("Total Short Leave Time : ");
        s.append(attendance.getTotalShortLeaveTime());
        s.append("\n");

        s.append("Total Short Leaves Taken: ");
        s.append(attendance.getTotalShortLeaves());
        s.append("\n");

        s.append("Total OT Hours : ");
        s.append(attendance.getTotalOTHours());
        s.append("\n");

        context.setResults(s.toString());
    }
}
