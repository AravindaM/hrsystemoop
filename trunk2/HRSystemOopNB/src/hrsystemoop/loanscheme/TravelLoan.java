/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

import hrsystemoop.modle.Employee;
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

    

public TravelLoan(String loanType,String loanId, double loanAmount, String  borrowedDate, String dueDate,int loanDuration) {
        super(loanType,loanId, loanAmount, borrowedDate, dueDate,loanDuration);

    }
public boolean  calHouseLoanValue(Employee employ, double loanAmount){

    if ((employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFIVE))&(traType==TravelType.ABROADONEMONTH))
    { acceptedAmount = 200000;
    return checkLoanAmount(acceptedAmount,loanAmount);}

    else if((employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFIVE))&(traType==TravelType.ABROADTWOWEEKS))
    { acceptedAmount = 100000;
    return checkLoanAmount(acceptedAmount,loanAmount);}

    else if((employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFOUR))&(traType==TravelType.ABROADTWOWEEKS))
    {acceptedAmount = 100000;
    return checkLoanAmount(acceptedAmount,loanAmount);}
    else if((employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTHREE))&(traType==TravelType.LOCALONEWEEK))
    {acceptedAmount = 20000;
    return checkLoanAmount(acceptedAmount,loanAmount);}

    else if((employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTWO))&(traType==TravelType.LOCALONEWEEK))
    {acceptedAmount = 20000;
    return checkLoanAmount(acceptedAmount,loanAmount);}

    else if((employ.getLevel().equals(hrsystemoop.modle.Level.LEVELONE))&(traType==TravelType.LOCALTHREEDAYS))
    {acceptedAmount = 10000;
    return checkLoanAmount(acceptedAmount,loanAmount);}

    return false;
    }


public boolean checkLoanAmount(double acceptedAmount,double loanAmount){

      if(loanAmount<acceptedAmount){
          return true;
      }
      return false;

    }


public enum TravelType {
    ABROADONEMONTH,
    ABROADTWOWEEKS,
    LOCALONEWEEK,
    LOCALTHREEDAYS;
}

}
