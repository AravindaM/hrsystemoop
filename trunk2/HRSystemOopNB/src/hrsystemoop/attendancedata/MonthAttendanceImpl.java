/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.attendancedata;

import java.util.ArrayList;

/**
 *
 * @author Isha Premadasa , idpremadasa@gmail.com
 */
public class MonthAttendanceImpl implements MonthAttendanceIntr, ShortLeaveCalcs, Cloneable {

// varaible declaring
    private int totalLeaves;
    private int annualLeaves;
    private int casualLeaves;
    private int medicalLeaves;
    private int totalOTHours;
    private int availablecasualleave;
    private int availableannualleave;
    private int availablemedicalleave;
// declaring of details of leaves and OT times for each emplyee for a month
    private ArrayList<AnnualLeave> employeeAnnualLeaves = new ArrayList<AnnualLeave>();
    private ArrayList<CasualLeave> employeeCasualLeaves = new ArrayList<CasualLeave>();
    private ArrayList<MedicalLeave> employeeMedicalLeaves = new ArrayList<MedicalLeave>();
    private ArrayList<OverTime> employeeOvertime = new ArrayList<OverTime>();
    private int annl_count;
    private int medi_count;
    private int casl_count;
    private int OT_count;
    private int fulldays;       // total of casual leaves of full day
    private int halfdays;       //total amount of 4 hour half day leaves
    private int halfday_hours;   // totalhours of halfday leaves

    public MonthAttendanceImpl() {
    }

// adding data into record arrays
    /**
     *
     * @param annualleave, a single annual leave day of an employee
     */
    public void addToAnnualLeaves(AnnualLeave annualleave) throws NullPointerException {

        employeeAnnualLeaves.add(annualleave);
        annl_count++;
    }

    /**
     *
     * @param medical leave, a single medical leave day of an employee
     */
    public void addToMedicalLeaves(MedicalLeave medicalleave) throws NullPointerException {

        employeeMedicalLeaves.add(medicalleave);
        medi_count++;
    }

    /**
     *
     * @param medical leave, a single medical leave day of an employee
     */
    public void addToCasualLeaves(CasualLeave casualleave) throws NullPointerException {

        employeeCasualLeaves.add(casualleave);
        casl_count++;
    }

    /**
     *
     * @param overtime, a single overtime day of an employee
     */
    public void addToovertime(OverTime overtime) throws NullPointerException {

        employeeOvertime.add(overtime);
        OT_count++;
    }

// Getters methods for each types of leaves
    /**
     *
     * @return totalLeaves number of leaves of an employee for a time period of single month
     */
    public int getTotalLeaves() {

        totalLeaves = getTotalAnaualLeaves() + getTotalCasualLeaves() + getTotalMedicalLeaves();
        return totalLeaves;
    }

    /**
     *
     * @return annualLeaves number of annualLeaves of an employee for a time period of single month
     */
    public int getTotalAnaualLeaves() {

        annualLeaves = annl_count;
        return annualLeaves;

    }

    /**
     *
     * @return casualLeaves number of casualLeaves of an employee for a time period of single month
     */
    public int getTotalCasualLeaves() {

        for (int y = 0; y < casl_count; y++) {
            if (employeeCasualLeaves.get(y).getLeaveType().equalsIgnoreCase("fullday")) {
                fulldays++;
            } else if (employeeCasualLeaves.get(y).getLeaveType().equalsIgnoreCase("halfday")) {
                halfdays++;
            }
        }


        casualLeaves = fulldays + (halfdays / 2);
        return casualLeaves;

    }

    /**
     *
     * @return medicalLeaves number of medicalLeaves of an employee for a time period of single month
     */
    public int getTotalMedicalLeaves() {
        medicalLeaves = medi_count;
        return medicalLeaves;
    }

    // @ return annaul leave details
    public ArrayList<AnnualLeave> getAnnaualLeavesDetails() {

        return employeeAnnualLeaves;
    }

    // @ return casual leave details
    public ArrayList<CasualLeave> getCasualLeavesDetails() {

        return employeeCasualLeaves;
    }

    // @ return medical leave details
    public ArrayList<MedicalLeave> getMedicalLeavesDetails() {

        return employeeMedicalLeaves;
    }

    // @ return overtime leave details
    public ArrayList<OverTime> getOTDetails() {

        return employeeOvertime;
    }
// calculating sort leave periods

    /**
     *
     * @return halfday_hours, total hours of half-days of an employee for a time period of single month
     */
    public int getTotalShortLeaveTime() {

        halfday_hours = halfdays * time_hours;

        return halfday_hours;
    }

    /**
     *
     * @return halfdays, total halfdays an employee for a time period of single month
     */
    public int getTotalShortLeaves() {

        return halfdays;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

// resetting total leaves
    public void resetAdditonalLeaves(int additionalleaves) {

        totalLeaves = additionalleaves;

    }

// @ return MonthAtendance instance
    public MonthAttendanceImpl getReport() {

        return this;
    }

    /**
     *
     * @return totalOTHours number of overtime ours of an employee for a time period of single month
     */
    public int getTotalOTHours() {

        for (int x = 0; x < OT_count; x++) {

            int time = employeeOvertime.get(x).getDuration();
            totalOTHours = totalOTHours + time;
        }

        return totalOTHours;
    }

// Getters for available amount of leaves
    /**
     *
     * @return availableannualleave, if false '0'
     */
    public int getAvailableAnnaulLeaves() {
        availableannualleave = AnnualLeave.maxleaves - annualLeaves;
        if (availableannualleave >= 0) {
            return availableannualleave;
        } else {
            return 0;
        }
    }

    /**
     *
     * @return availablecasualleave, if false '0'
     */
    public int getAvailableCasualLeaves() {
        availablecasualleave = CasualLeave.maxleaves - casualLeaves;
        if (availablecasualleave >= 0) {
            return availablecasualleave;
        } else {
            return 0;
        }
    }

    /**
     *
     * @return availablecasualleave, if false '0'
     */
    public int getAvailableMedicalLeaves() {

        availablemedicalleave = MedicalLeave.maxleaves - medicalLeaves;
        if (availablemedicalleave >= 0) {
            return availablemedicalleave;
        } else {
            return 0;
        }
    }

    public ArrayList getLeavesDetails() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
