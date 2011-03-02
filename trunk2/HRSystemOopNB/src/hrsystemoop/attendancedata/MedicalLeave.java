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
public class MedicalLeave extends Leave{


    static  final int maxleaves = 14;
    private int duration;
    String end_date;

    public MedicalLeave(String date, String reason, String end_date) {
        super(date, reason);
        this.end_date =end_date;
        calc_duration(end_date);

    }

// Setters and Getters for end_date and duration

    public void setDuration(int duration){
        this.duration = duration;
    }

    public int getDuration(){

        return duration;
    }

    public void setEndDate(String end_date){
        this.end_date = end_date;
    }

    public String getEndDate(){

        return end_date;
    }


    /**
     * @Param end_date calculates the duration of a medical leave period
     */
    private void calc_duration(String end_date) {

       // duration = end_date.getDate()- super.getLeaveDate().getDate();
    }
}
