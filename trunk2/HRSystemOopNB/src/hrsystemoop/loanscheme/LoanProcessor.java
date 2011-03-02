/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

import hrsystemoop.modle.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author araLDAM
 */
public class LoanProcessor {
    private String userId;
    ArrayList<String>  loanDetails;
    LoanImpl aLoan;


    public void EditLoanDetails(String loanId,double loanAmount,Date borrowedDate,Date dueDate){

    aLoan.setLoanId(loanId);
    aLoan.setLoanAmount(loanAmount);
    aLoan.setBorrowedDate(borrowedDate);
    aLoan.setDueDate(dueDate);
    }
    

    public ArrayList<String> getLoanDetails(){
    loanDetails.add(aLoan.getLoanId());
    loanDetails.add(aLoan.getLoanAmount()+"");
    loanDetails.add(aLoan.getBorrowedDate()+"");
    loanDetails.add(aLoan.getDuedDate()+"");
    return  loanDetails;
    }


    public void removeLoanDetails(){
    aLoan.setLoanId(null);
    aLoan.setLoanAmount(0.00);
    aLoan.setBorrowedDate(null);
    aLoan.setDueDate(null);

    }

    public double getTotalLoanAmount(Employee employee){
      double totalLoanAmount = 0;
      

    return totalLoanAmount;
    }

}

