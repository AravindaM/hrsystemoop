/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

import hrsystemoop.modle.Employee;
import java.util.Date;
import java.util.logging.Level;
import javax.xml.datatype.Duration;

/**
 *
 * @author araLDAM
 */
public class TravelLoan extends LoanImpl {

    double travelEstimateValue;
    double acceptedAmount;
    Level level;
    private String travelLocation;
    private Duration travelDuration;
    TravelType traType;

    

public TravelLoan(String loanId, double loanAmount, Date borrowedDate, Date dueDate) {
        super(loanId, loanAmount, borrowedDate, dueDate); 

    }
public Double calHouseLoanValue(Employee employ){


    switch (month) {
            case 1:  monthString = "January";       break;
            case 2:  monthString = "February";      break;
            case 3:  monthString = "March";         break;
            case 4:  monthString = "April";         break;
            case 5:  monthString = "May";           break;
            case 6:  monthString = "June";          break;
            case 7:  monthString = "July";          break;
            case 8:  monthString = "August";        break;
            case 9:  monthString = "September";     break;
            case 10: monthString = "October";       break;
            case 11: monthString = "November";      break;
            case 12: monthString = "December";      break;
            default: monthString = "Invalid month"; break;
        }


    if ((employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFIVE))&(traType==TravelType.ABROADONEMONTH))
    {
    acceptedAmount = houseEstimateValue*.3;
    }
    else if((employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFIVE))&(traType==TravelType.ABROADTWOWEEKS))
    {
    acceptedAmount = houseEstimateValue*.35;
    }

    else if((employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFOUR))&(traType==TravelType.ABROADTWOWEEKS))
    {
    acceptedAmount = houseEstimateValue*.35;
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTHREE))
    {
    acceptedAmount = houseEstimateValue*.4;
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFOUR))
    {
    acceptedAmount = houseEstimateValue*.45;
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFIVE))
    {
    acceptedAmount = houseEstimateValue*.5;
    }
    return acceptedAmount;
    }

public enum TravelType {

    ABROADONEMONTH,
    ABROADTWOWEEKS,
    LOCALONEWEEK,
    LOCALTHREEDAYS;
//
//    LEVELFIVE(100000,1000),
//    LEVELFOUR(80000,800),
//    LEVELTHREE(50000,500),
//    LEVELTWO(30000,300),
//    LEVELONE(20000,200);
//
//    private final int baseSalary;
//    private final int overtimeRate;
//
//    Level(int baseSalary, int overtimeRate) {
//        this.baseSalary = baseSalary;
//        this.overtimeRate = overtimeRate;
//    }
//
//    private int getBaseSalary() {
//        return baseSalary;
//    }
//
//    private int getOvertimeRate() {
//        return overtimeRate;
//    }
//
//    public int getSalary(int overtime) {
//        return getBaseSalary() + overtime*getOvertimeRate();
//    }
//
//    // Employer e = new Employer(Level.LEVELONE);
}


}
