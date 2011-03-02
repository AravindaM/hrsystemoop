/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

import java.util.Date;

/**
 *
 * @author Isha Premadasa
 */
public class OverTime {

    private Date overtimedate;
    private int OT_duration;


    public OverTime(Date overtimedate, int duration){
        this.overtimedate = overtimedate;
        this.OT_duration= duration;
    }


// Setters and Getters for date and duration
    public void  setDate(int year, int month, int date){

        overtimedate = new Date(year, month, date);
    }

    public Date getOvertimeDate(){
        return overtimedate;
    }

    public void setDuration (int hours){

        OT_duration = hours;
    }

    public int getDuration (){

        return OT_duration;
    }
}
