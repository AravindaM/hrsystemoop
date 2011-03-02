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
    private double acceptedAmount;
    Level level;

    public HousingLoan(String loanId, double loanAmount, Date borrowedDate, Date dueDate) {
        super(loanId, loanAmount, borrowedDate, dueDate);
    }

    public Double calHouseLoanValue(Employee employ){
    if (employ.getLevel().compareTo(hrsystemoop.modle.Level.LEVELONE))
    {
    acceptedAmount = houseEstimateValue*.3;
    }
    else if(employ.getLevel().compareTo(hrsystemoop.modle.Level.LEVELTWO))
    {
    acceptedAmount = houseEstimateValue*.35;
    }

    else if(employ.getLevel().compareTo(hrsystemoop.modle.Level.LEVELTHREE))
    {
    acceptedAmount = houseEstimateValue*.4;
    }

    else if(employ.getLevel().compareTo(hrsystemoop.modle.Level.LEVELFOUR))
    {
    acceptedAmount = houseEstimateValue*.45;
    }

    else if(employ.getLevel().compareTo(hrsystemoop.modle.Level.LEVELFIVE))
    {
    acceptedAmount = houseEstimateValue*.5;
    }
    return acceptedAmount;
    }
}
