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

    private Date leavedate;
    private String reason;
 
    
    public Leave( Date leavedate, String reason){
        this.leavedate = leavedate;
        this.reason = reason;
        
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

    

    

}
