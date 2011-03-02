/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.attendancedata;

import java.util.ArrayList;

/**
 *
 * @author Isha Premadasa
 */
interface MonthAttendanceIntr {

 /**
  * 
  * abstract methods to calculate the monthly report's details
  */
    public int getTotalLeaves();

    public int getTotalOTHours();

    public int getTotalAnaualLeaves();

    public int getTotalCasualLeaves();

    public int getTotalMedicalLeaves();

    public void resetAdditonalLeaves(int additionalLeaves);

    public int getAvailableAnnaulLeaves();

    public int getAvailableCasualLeaves();

    public int getAvailableMedicalLeaves();

    public ArrayList getLeavesDetails();

}
