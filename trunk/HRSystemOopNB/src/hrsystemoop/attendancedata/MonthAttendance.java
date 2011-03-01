/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
public class MonthAttendance implements MonthAttendanceProcess{

    private int totalLeaves;
    private ArrayList<Leave> employeeLeaves;
    private ArrayList<OverTime>  employeeOvertime;
    
    public MonthAttendance(ArrayList<Leave> employeeLeaves, ArrayList<OverTime> employeeOvertime){

    this.employeeLeaves= employeeLeaves;
    this.employeeOvertime= employeeOvertime;
    }

    public int getFullLeaves() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getShortLeaves() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getTotalLeaves() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Date[] getLeaveDates() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getLeaveTimes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getOvertimeHours() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

}
