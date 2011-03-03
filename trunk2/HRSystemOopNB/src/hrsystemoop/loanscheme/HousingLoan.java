/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

import hrsystemoop.modle.Employee;
import java.util.logging.Level;

/**
 *
 * @author araLDAM
 */
public class HousingLoan extends LoanImpl{

    Double houseEstimateValue;
    double acceptedAmount;
    Level level;

    public HousingLoan(String loanType,String loanId, double loanAmount, String borrowedDate, String dueDate, int loanDuration) {
        super( loanType,loanId, loanAmount, borrowedDate, dueDate,loanDuration);
    }



    public boolean checkHouseLoanValue(Employee employ,Double loanAmount){

    if (employ.getLevel().equals(hrsystemoop.modle.Level.LEVELONE))
    {
        acceptedAmount = houseEstimateValue*.4;
        return checkLoanAmount(acceptedAmount,loanAmount);
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTWO))
    {
    acceptedAmount = houseEstimateValue*.45;
     return checkLoanAmount(acceptedAmount,loanAmount);
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTHREE))
    {
    acceptedAmount = houseEstimateValue*.5;
     return checkLoanAmount(acceptedAmount,loanAmount);
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFOUR))
    {
    acceptedAmount = houseEstimateValue*.55;
    return checkLoanAmount(acceptedAmount,loanAmount);
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFIVE))
    {
    acceptedAmount = houseEstimateValue*.6;
    return checkLoanAmount(acceptedAmount,loanAmount);
    }
    return false;
    }


    public boolean checkLoanAmount(double acceptedAmount,double loanAmount){

      if(loanAmount<acceptedAmount){
          return true;
      }
      return false;

    }


}
