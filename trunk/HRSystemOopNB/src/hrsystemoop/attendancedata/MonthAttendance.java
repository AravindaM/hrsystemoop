/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author TOSHIBA
 */
public class MonthAttendance implements MonthAttendanceProcess{

    private int totalLeaves;
    private ArrayList<Leave> employeeLeaves;
    private ArrayList<OverTime>  employeeOvertime;
    private HashMap<Date, String> leavedates= new HashMap<Date, String>();
    private HashMap<Date, Integer> OTdates= new HashMap<Date, Integer>();


    public MonthAttendance(ArrayList<Leave> employeeLeaves, ArrayList<OverTime> employeeOvertime){

    this.employeeLeaves= employeeLeaves;
    this.employeeOvertime= employeeOvertime;
//    this.leavedates= new HashMap<Date, String>();
    }

    

    public int getTotalLeaves() {
        return employeeLeaves.size();
    }

    public HashMap <Date, String> getLeaveDetails() {

        for (int x= 0; x < employeeLeaves.size(); x++){

            leavedates.put(employeeLeaves.get(x).getLeaveDate(), employeeLeaves.get(x).getReason());

        }

        return leavedates;
    }

    public int getTotalOTHours() {
        return employeeOvertime.size();

    }

    public HashMap <Date, Integer> getOTDetails() {

        for (int x= 0; x < employeeOvertime.size(); x++){

            OTdates.put(employeeOvertime.get(x).getOvertimeDate(), employeeOvertime.get(x).getDuration());

        }

        return OTdates;
    }
    

    

    

}
