/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.Attendance;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
public class Leave {

    private Date leavedate;
    private String reason;
    private Date starttime;
    private Date endtime;
    private int year;
    private int month;
    private int date;

    
    
    public Leave(){

        
    }

    private void setLeaveDate(int year, int month, int dateyear ){
        
        leavedate= new Date(year, month, dateyear);

        
    }

    private Date getLeaveDate(){

         return leavedate;

    }
}
