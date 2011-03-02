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
public abstract class Leave {

    private String leavedate;
    private String reason;
 
    
    public Leave( String leavedate, String reason){
        this.leavedate = leavedate;
        this.reason = reason;
        
    }

    public void setLeaveDate(int year, int month, int date ){
        
        leavedate= year+""+month+""+date;
    }

    public String getLeaveDate(){

         return leavedate;
    }

    public void setReason(String leave_reason){

        reason = leave_reason;
    }

    public String getReason(){

        return reason;
    }

    

    

}
