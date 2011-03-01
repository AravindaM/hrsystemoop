/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.Attendance;

import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
interface MonthAttendanceProcess {

    public  int getFullLeaves();
    public  int getShortLeaves();
    public  int getTotalLeaves();
    public  Date[] getLeaveDates();
    public  int getLeaveTimes();
}
