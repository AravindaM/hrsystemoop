/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

import hrsystemoop.modle.Employee;
import java.util.Date;
import java.util.logging.Level;

/**
 *
 * @author araLDAM
 */
public class HousingLoan extends LoanImpl{

    Double houseEstimateValue;
    double acceptedAmount;
    Level level;

    public HousingLoan(String loanId, double loanAmount, Date borrowedDate, Date dueDate, int loanDuration) {
        super(loanId, loanAmount, borrowedDate, dueDate,loanDuration);
    }

    public Double calHouseLoanValue(Employee employ){

    if (employ.getLevel().equals(hrsystemoop.modle.Level.LEVELONE))
    {
    acceptedAmount = houseEstimateValue*.4;
    }
    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTWO))
    {
    acceptedAmount = houseEstimateValue*.45;
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTHREE))
    {
    acceptedAmount = houseEstimateValue*.5;
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFOUR))
    {
    acceptedAmount = houseEstimateValue*.55;
    }

    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFIVE))
    {
    acceptedAmount = houseEstimateValue*.6;
    }
    return acceptedAmount;
    }
}
