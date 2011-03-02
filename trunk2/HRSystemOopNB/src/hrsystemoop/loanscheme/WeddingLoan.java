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

     public WeddingLoan(String loanId, double loanAmount, String borrowedDate, String dueDate,int loanDuration) {
        super(loanId, loanAmount, borrowedDate, dueDate,loanDuration);
    }

    public Double calWeddingLoanValue(Employee employ){

    if (employ.getLevel().equals(hrsystemoop.modle.Level.LEVELONE))
    {acceptedAmount = 50000;}
    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTWO))
    {acceptedAmount = 60000;}
    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELTHREE))
    {acceptedAmount = 75000;}
    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFOUR))
    {acceptedAmount = 100000;}
    else if(employ.getLevel().equals(hrsystemoop.modle.Level.LEVELFIVE))
    {acceptedAmount = 200000;}

    return acceptedAmount;
    }
    

}

