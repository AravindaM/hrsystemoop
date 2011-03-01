/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.attendancedata;

/**
 *
 * @author TOSHIBA
 */
interface MonthAttendanceProcess {

    public int getTotalLeaves();

    public int getTotalOTHours();

    public int getTotalAnaualLeaves();

    public int getTotalCasualLeaves();

    public int getTotalMedicalLeaves();

    public int getAdditionalLeaves();

    public void resetAdditonalLeaves(int additionalLeaves);
}
