/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
public class Leave {

    private Date leavedate;
    private String reason;
    private int starttime;
    private int endtime;
//    private int totalLeaves;

//    private int year;
//    private int month;
//    private int date;

    
    
    public Leave(){
        //        totalLeaves++;

        
    }

    public void setLeaveDate(int year, int month, int dateyear ){
        
        leavedate= new Date(year, month, dateyear);
     
    }

    public Date getLeaveDate(){

         return leavedate;
    }

    public void setReason(String leave_reason){

        reason = leave_reason;
    }

    public String getReason(){

        return reason;
    }

    public void setStartTime(int start_time ){

        starttime = start_time;

    }

    public int setStartTime(){

         return starttime;
    }

    public void setEndTime(int end_time ){

        endtime = end_time;

    }

    public  int getEndTime(){

         return endtime;
    }

    private void process(){


    }

//get total leaves
//    public int getLeaveCount(){
//
//        return totalLeaves;
//    }
}
