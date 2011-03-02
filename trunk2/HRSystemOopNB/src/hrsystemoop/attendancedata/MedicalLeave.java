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
    Date end_date;

    public MedicalLeave(Date date, String reason, Date end_date) {
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

    public void setEndDate(Date end_date){
        this.end_date = end_date;
    }

    public Date getEndDate(){

        return end_date;
    }


    /**
     * This method calculates the duration of a medical leave period
     */
    private void calc_duration(Date end_date) {

        duration = end_date.getDate()- super.getLeaveDate().getDate();
    }
}
