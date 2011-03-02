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
public class LoanProcessor implements Cloneable {

    private String userId;
    ArrayList<String> loanDetails;
    private LoanImpl aLoan;
    int noOfLoansBorrowed;
    int noOfMonthsPaid;
    int loanDuration;
    int maxNoOfLoans;
    LoanProcessor loanProc;
    private double totalLoanAmount;
    ArrayList<LoanImpl> loans;

    public LoanProcessor() {

        maxNoOfLoans = 3;
    }


 /**
 *@param
 * Creates a new loan Object using the parameters LoanId, loan amount,
 * loan borrowed date, due date and the loan duration.Here check weather the maximum no of loans
  * that can be borrowed by a employee is exceeded before creating a loan Object.
 */
    public boolean addLoan(String loanId,double loanAmount,String borrowedDate,String dueDate, int loanDuration){

    if(noOfLoansBorrowed<3){
    LoanImpl newLoan = new LoanImpl(loanId, loanAmount, borrowedDate, dueDate, loanDuration);
    loans.add(newLoan);
    noOfLoansBorrowed++;
    return true;
        }
    else
      return false;
        }
    
   /**
    *
    * @param
    * Edit a particular loan details of a employee. Since employee can have maximum three loans
    * LoanId will be used to find the correct loan from the Loans Array list.
    */
    public void EditLoanDetails(String loanId,double loanAmount,String borrowedDate,String dueDate,int loanDuration){
        for(int i=0;i<loans.size();i++){
            LoanImpl tempLoan=null;
            if(tempLoan.getLoanId().equals(loanId)){
            tempLoan = loans.get(i);

        tempLoan.setLoanId(loanId);
        tempLoan.setLoanAmount(loanAmount);
        tempLoan.setBorrowedDate(borrowedDate);
        tempLoan.setDueDate(dueDate);

        loans.add(i,tempLoan);
            }
        }
    }

    /**
     * Used to View the loan details of particular employee
     *
     */
   public ArrayList<String> viewLoanDetails(){
   for(int i=0;i<loans.size();i++){
       LoanImpl loanTemp=null;
       loanTemp=loans.get(i);

    loanDetails.add(loanTemp.getLoanId());
    loanDetails.add(String.valueOf(loanTemp.getLoanAmount()));
    loanDetails.add(loanTemp.getBorrowedDate().toString());
    loanDetails.add(loanTemp.getDuedDate().toString());
       }
    return  loanDetails;
   }



    public void removeLoanDetails(String loanID){
        for(int i=0;i<loans.size();i++){
            if(loans.get(i).getLoanId().equals(loanID)){
            loans.remove(i);
            }
        }
    }


    public int getNoofLoansBorrowed(){
    return noOfLoansBorrowed;
    }


    public double getMonthlySum(ArrayList<LoanImpl> loans){
    double monthlyLoanSum=0;
    for(int i=0;i<3;i++){
    monthlyLoanSum =+loanProc.getMonthlySumPerLoan(loans.get(i));
           }

        return monthlyLoanSum;
    }

    public double getMonthlySumPerLoan(LoanImpl loan) {
        double monthlySumPerLoan = 0;
        if (loan != null) {
            monthlySumPerLoan = loanProc.getTotalLoanAmountPerLoan(loan) / (loan.getLoanDuration() - loan.getNoOfMonthsPaid());
        }
        return monthlySumPerLoan;
    }

    public double getTotalLoanAmount(ArrayList<LoanImpl> loans){
      double loanAmount = 0;
      for(int i=0;i<3;i++){
      totalLoanAmount =loanProc.getTotalLoanAmountPerLoan(loans.get(i));
        }
    return totalLoanAmount;

    }

    public double getTotalLoanAmountPerLoan(LoanImpl loan) {
        double loanAmount;

        loanAmount = -loan.getValueOfAInstallement() * loan.getNoOfMonthsPaid();
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
