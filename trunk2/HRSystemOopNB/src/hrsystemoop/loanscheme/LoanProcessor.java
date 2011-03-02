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
    private LoanImpl aLoan;
    int noOfLoansBorrowed;
    int noOfMonthsPaid;
    int loanDuration;
    int maxNoOfLoans;
    LoanProcessor loanProc;
    private double totalLoanAmount;

    public LoanProcessor(int noOfLoansBorrowed, int noOfMonthsPaid) {
        this.noOfLoansBorrowed = noOfLoansBorrowed;
        this.noOfMonthsPaid = noOfMonthsPaid;
        maxNoOfLoans=3;
    }

    public void EditLoanDetails(String loanId,double loanAmount,Date borrowedDate,Date dueDate){

        getaLoan().setLoanId(loanId);
        getaLoan().setLoanAmount(loanAmount);
        getaLoan().setBorrowedDate(borrowedDate);
        getaLoan().setDueDate(dueDate);
    }
    

    public ArrayList<String> getLoanDetails(){
    loanDetails.add(getaLoan().getLoanId());
    loanDetails.add(getaLoan().getLoanAmount()+"");
    loanDetails.add(getaLoan().getBorrowedDate()+"");
    loanDetails.add(getaLoan().getDuedDate()+"");
    return  loanDetails;
    }


    public void removeLoanDetails(){
        getaLoan().setLoanId(null);
        getaLoan().setLoanAmount(0.00);
        getaLoan().setBorrowedDate(null);
        getaLoan().setDueDate(null);

    }
    public int getNoofLoansBorrowed(){
    return noOfLoansBorrowed;
    }


    public double getMonthlySum(Employee employ){
    double monthlyLoan=0;
    for(int i=0;i<3;i++){
    monthlyLoan = employ.LoanProcessor.

    }

    monthlyLoan =

    return monthlyLoan;
    }

    public double getMonthlySumPerLoan(LoanImpl loan){
    double monthlySumPerLoan=0;
    monthlySumPerLoan = loanProc.getTotalLoanAmountPerLoan(loan)/(loan.getLoanDuration()-loan.getNoOfMonthsPaid());

    return monthlySumPerLoan;
    }

//    public double getTotalLoanAmount(){
//      double loanAmount = 0;
//
//    totalLoanAmount =+loanProc.getTotalLoanAmountPerLoan();
//    return totalLoanAmount;
//    }

    public double getTotalLoanAmountPerLoan(LoanImpl loan){
    double loanAmount;

    loanAmount=- loan.getValueOfAInstallement()*noOfMonthsPaid;
    return loanAmount;
    }

    /**
     * @return the aLoan
     */
    public LoanImpl getaLoan() {
        return aLoan;
    }

    /**
     * @param aLoan the aLoan to set
     */
    public void setaLoan(LoanImpl aLoan) {
        this.aLoan = aLoan;
    }
}

