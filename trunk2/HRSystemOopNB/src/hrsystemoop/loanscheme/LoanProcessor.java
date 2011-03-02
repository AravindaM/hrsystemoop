/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

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


    public LoanProcessor() {
        
        maxNoOfLoans=3;
    }

    public void EditLoanDetails(String loanId,double loanAmount,Date borrowedDate,Date dueDate){

        aLoan.setLoanId(loanId);
        aLoan.setLoanAmount(loanAmount);
        aLoan.setBorrowedDate(borrowedDate);
        aLoan.setDueDate(dueDate);
    }
    

    public ArrayList<String> getLoanDetails(){
    loanDetails.add(getaLoan().getLoanId());
    loanDetails.add(getaLoan().getLoanAmount()+"");
    loanDetails.add(getaLoan().getBorrowedDate()+"");
    loanDetails.add(getaLoan().getDuedDate()+"");
    return  loanDetails;
    }


    public void removeLoanDetails(){
        aLoan.setLoanId(null);
        aLoan.setLoanAmount(0.00);
        aLoan.setBorrowedDate(null);
        aLoan.setDueDate(null);

    }
    public int getNoofLoansBorrowed(){
    return noOfLoansBorrowed;
    }


    public double getMonthlySum(LoanImpl loanA,LoanImpl loanB,LoanImpl loanC){
    double monthlyLoanSum=0;
   
    monthlyLoanSum =loanProc.getMonthlySumPerLoan(loanA)+
                 loanProc.getMonthlySumPerLoan(loanB)+
                 loanProc.getMonthlySumPerLoan(loanC);

    return monthlyLoanSum;
    }

    public double getMonthlySumPerLoan(LoanImpl loan){
    double monthlySumPerLoan=0;
    if(loan!=null){
    monthlySumPerLoan = loanProc.getTotalLoanAmountPerLoan(loan)/(loan.getLoanDuration()-loan.getNoOfMonthsPaid());
        }
    return monthlySumPerLoan;
    }


    public double getTotalLoanAmount(LoanImpl loanA,LoanImpl loanB,LoanImpl loanC){
      double loanAmount = 0;

    totalLoanAmount =loanProc.getTotalLoanAmountPerLoan(loanA)+
                     loanProc.getTotalLoanAmountPerLoan(loanB)+
                     loanProc.getTotalLoanAmountPerLoan(loanC);
    return totalLoanAmount;
    }


    public double getTotalLoanAmountPerLoan(LoanImpl loan){
    double loanAmount;

    loanAmount=- loan.getValueOfAInstallement()*loan.getNoOfMonthsPaid();
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

