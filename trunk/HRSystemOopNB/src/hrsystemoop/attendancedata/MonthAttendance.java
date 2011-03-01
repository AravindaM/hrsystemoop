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
    private int totalOTHours;
    private ArrayList<Leave> employeeLeaves =new ArrayList<Leave>();
    private ArrayList<OverTime>  employeeOvertime = new ArrayList<OverTime>();
    private HashMap<Date, String> leavedetails= new HashMap<Date, String>();
    private HashMap<Date, Integer> OTdetails= new HashMap<Date, Integer>();


    public MonthAttendance(){

    }

    /**
     *
     * @param leave a single leave day of an employee
     */

    private void addToleaves(Leave leave){

        employeeLeaves.add(leave);
    }

    /**
     *
     * @param overtime a single overtime day of an employee
     */
    private  void addToovertime(OverTime overtime){

        employeeOvertime.add(overtime);
    }

    /**
     *
     * @return totalOTHours number of overtime ours of an employee for a time period of single month
     */
    public int getTotalOTHours() {

        for (int x= 0; x < employeeOvertime.size(); x++){

            int time = employeeOvertime.get(x).getDuration();
            totalOTHours = totalOTHours+time;
        }  
        
        return totalOTHours;
    }

    public HashMap <Date, String> getLeaveDetails() {

        for (int x= 0; x < employeeLeaves.size(); x++){

            leavedetails.put(employeeLeaves.get(x).getLeaveDate(), employeeLeaves.get(x).getReason());

        }

        return leavedetails;
    }

    public int getTotalLeaves() {

        totalLeaves= employeeOvertime.size();
        return totalLeaves;
    }

    public HashMap <Date, Integer> getOTDetails() {

        for (int x= 0; x < employeeOvertime.size(); x++){

            OTdetails.put(employeeOvertime.get(x).getOvertimeDate(), employeeOvertime.get(x).getDuration());

        }

        return OTdetails;
    }
    
    public MonthAttendance getReport (){
    
        return  this;
    }
    

    

}
