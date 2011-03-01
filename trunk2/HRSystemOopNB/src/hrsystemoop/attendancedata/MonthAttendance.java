/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

import java.util.ArrayList;

/**
 *
 * @author TOSHIBA
 */
public class MonthAttendance implements MonthAttendanceProcess{

    private int totalLeaves;
    private int annualLeaves;
    private int casualLeaves;
    private int medicalLeaves;
    private int extraleaves;
    private int totalOTHours;

    private ArrayList<AnnualLeave> employeeAnnualLeaves =new ArrayList<AnnualLeave>();
    private ArrayList<CasualLeave> employeeCasualLeaves =new ArrayList<CasualLeave>();
    private ArrayList<MedicalLeave> employeeMedicalLeaves =new ArrayList<MedicalLeave>();

    private ArrayList<OverTime>  employeeOvertime = new ArrayList<OverTime>();
    

    public MonthAttendance(){

    }

    /**
     *
     * @param leave a single leave day of an employee
     */

    private void addToAnnualLeaves(AnnualLeave annualleave){

        employeeAnnualLeaves.add(annualleave);
    }



    /**
     *
     * @param overtime a single overtime day of an employee
     */
    private  void addToovertime(OverTime overtime){

        employeeOvertime.add(overtime);
    }

    /**
     *
     * @param leave a single leave day of an employee
     */

    private void addToMedicalLeaves(MedicalLeave medicalleave){

        employeeMedicalLeaves.add(medicalleave);
    }


    /**
     *
     * @return totalOTHours number of overtime ours of an employee for a time period of single month
     */
    public int getTotalOTHours() {

        for (int x= 0; x < employeeOvertime.size(); x++){

            int time = employeeOvertime.get(x).getDuration();
            totalOTHours = totalOTHours+time;
        }  
        
        return totalOTHours;
    }


    public int getExtraLeaves() {
        int max = MedicalLeave.maxleave;
        extraleaves = employeeMedicalLeaves.size() - max;

        return extraleaves;
    }

    

    public int getTotalLeaves() {

        totalLeaves = employeeAnnualLeaves.size() + employeeCasualLeaves.size()+ employeeMedicalLeaves.size();
        return totalLeaves;
    }



    
    public MonthAttendance getReport (){
    
        return  this;
    }

    public int getTotalAnaualLeaves() {

        annualLeaves= employeeAnnualLeaves.size();
        return annualLeaves;

    }

    public int getTotalCasualLeaves() {

        casualLeaves= employeeCasualLeaves.size();
        return casualLeaves;

    }


    public int getTotalMedicalLeaves() {
        medicalLeaves= employeeMedicalLeaves.size();
        return medicalLeaves;
    }
    

    

}
