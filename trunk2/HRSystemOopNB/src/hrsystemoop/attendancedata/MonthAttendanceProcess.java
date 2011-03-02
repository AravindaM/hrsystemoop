/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.attendancedata;

/**
 *
 * @author Isha Premadasa
 */
interface MonthAttendanceProcess {

    public int getTotalLeaves();

    public int getTotalOTHours();

    public int getTotalAnaualLeaves();

    public int getTotalCasualLeaves();

    public int getTotalMedicalLeaves();

    public void resetAdditonalLeaves(int additionalLeaves);

    public int getAvailableAnnaulLeaves();

    public int getAvailableCasualLeaves();

    public int getAvailableMedicalLeaves();



}
