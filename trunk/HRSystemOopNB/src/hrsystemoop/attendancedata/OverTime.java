/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author TOSHIBA
 */
public class OverTime {

    private Date overtimedate;
    private int duration;


    public OverTime(){

    }

    public void  setDate(int year, int month, int date){

        overtimedate = new Date(year, month, date);
    }

    public Date getOvertimeDate(){
        return overtimedate;
    }

    public void setDuration (int hours){

        duration = hours;
    }

    public int getDuration (){

        return duration;
    }
}
