/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

import hrsystemoop.modle.Employee;
import java.util.Date;

/**
 *
 * @author araLDAM
 */
public class WeddingLoan extends LoanImpl{
    private double acceptedAmount;

     public WeddingLoan(String loanType,String loanId, double loanAmount, String borrowedDate, String dueDate,int loanDuration) {
        super( loanType,loanId, loanAmount, borrowedDate, dueDate,loanDuration);
    }

    public boolean  calWeddingLoanValue(Employee employ,double loanAmount){

    if (employ.getLevel().equals(hrsystemoop.modle.Level.LEVELONE))
    {acceptedAmount = 50000;
    return checkLoanAmount(acceptedAmount,loanAmount);}

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTWO))
    {acceptedAmount = 60000;
    return checkLoanAmount(acceptedAmount,loanAmount);}

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTHREE))
    {acceptedAmount = 75000;
    return checkLoanAmount(acceptedAmount,loanAmount);}

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFOUR))
    {acceptedAmount = 100000;
    return checkLoanAmount(acceptedAmount,loanAmount);
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFIVE))
    {acceptedAmount = 200000;
    return checkLoanAmount(acceptedAmount,loanAmount);}

    return false;
    }


    public boolean checkLoanAmount(double acceptedAmount,double loanAmount){

      if(loanAmount<acceptedAmount){
          return true;
      }
      return false;

    }

}

