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
public class MonthAttendance implements MonthAttendanceProcess, ShortLeave{

// varaible declaring
    private int totalLeaves;
    private int annualLeaves;
    private int casualLeaves;
    private int medicalLeaves;
    private int extraleaves;
    private int totalOTHours;

    private int availablecasualleave;
    private int availableannualleave;
    private int availablemedicalleave;

// declaring of details of leaves and OT times for each emplyee for a month
    private ArrayList<AnnualLeave> employeeAnnualLeaves =new ArrayList<AnnualLeave>();
    private ArrayList<CasualLeave> employeeCasualLeaves =new ArrayList<CasualLeave>();
    private ArrayList<MedicalLeave> employeeMedicalLeaves =new ArrayList<MedicalLeave>();
    private ArrayList<OverTime>  employeeOvertime = new ArrayList<OverTime>();

    private int annl_length = employeeAnnualLeaves.size();
    private int casl_length = employeeCasualLeaves.size();
    private int medi_length = employeeMedicalLeaves.size();
    private int OT_length = employeeOvertime.size();


    private int fulldays;       // total of casual leaves of full day
    private int halfdays;       //total amount of 4 hour half day leaves
    private int halfday_hours;   // totalhours of halfday leaves

    

    public MonthAttendance(){
    }

// adding data into record arrays

    /**
     *
     * @param annualleave, a single annual leave day of an employee
     */
    private void addToAnnualLeaves(AnnualLeave annualleave){

        employeeAnnualLeaves.add(annualleave);
    }

    /**
     *
     * @param medical leave, a single medical leave day of an employee
     */
    private void addToMedicalLeaves(MedicalLeave medicalleave){

        employeeMedicalLeaves.add(medicalleave);
    }

    /**
     *
     * @param medical leave, a single medical leave day of an employee
     */
    private void addToCasualLeaves(CasualLeave casualleave){

        employeeCasualLeaves.add(casualleave);
    }

    /**
     *
     * @param overtime, a single overtime day of an employee
     */
    private  void addToovertime(OverTime overtime){

        employeeOvertime.add(overtime);
    }

// Getters methods for each types of leaves
    
     public int getTotalLeaves() {

        totalLeaves = getTotalAnaualLeaves() + getTotalCasualLeaves()+ getTotalMedicalLeaves();
        return totalLeaves;
    }

    public int getTotalAnaualLeaves() {

        annualLeaves= annl_length;
        return annualLeaves;

    }

    public int getTotalCasualLeaves() {

        for (int y=0; y< casl_length; y++){
            if(employeeCasualLeaves.get(y).getLeaveType().equals("fullday")){
                fulldays++;
            }
            else if (employeeCasualLeaves.get(y).getLeaveType().equals("halfday")){
                halfdays++;
            }
        }


        casualLeaves= fulldays + (halfdays/2);
        return casualLeaves;

    }


    public int getTotalMedicalLeaves() {
        medicalLeaves= employeeMedicalLeaves.size();
        return medicalLeaves;
    }


    
    public MonthAttendance getReport (){
    
        return  this;
    }

    

//    public int getAdditionalLeaves() {
//        int max = MedicalLeave.maxleave;
//        extraleaves = medi_length - max;
//
//        return extraleaves;
//    }

    public int getTotalShortLeaveTime() {

        halfday_hours = halfdays * time_hours;

        return halfday_hours;
    }

    public void resetAdditonalLeaves(int leaves) {

        totalLeaves =  leaves;
        
    }

    public int getTotalShortLeaves() {
        return halfdays;
    }

    /**
     *
     * @return totalOTHours number of overtime ours of an employee for a time period of single month
     */
    public int getTotalOTHours() {

        for (int x= 0; x < OT_length; x++){

            int time = employeeOvertime.get(x).getDuration();
            totalOTHours = totalOTHours + time;
        }

        return totalOTHours;
    }
    public int getAvailableAnnaulLeaves() {
        availableannualleave = AnnualLeave.maxleaves-annualLeaves;
              if(availableannualleave >= 0){
                return availableannualleave;
        }
        else
            return 0;
    }

    public int getAvailableCasualLeaves() {
        availablecasualleave = CasualLeave.maxleaves-casualLeaves;
              if(availablecasualleave >= 0){
                return availablecasualleave;
        }
        else
            return 0;     }

    public int getAvailableMedicalLeaves() {

        availablemedicalleave = MedicalLeave.maxleaves-medicalLeaves;
              if(availablemedicalleave >= 0){
                return availablemedicalleave;
        }
        else
            return 0;         }

    


    



}
