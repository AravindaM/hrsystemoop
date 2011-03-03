/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.loanscheme;

import java.util.ArrayList;

/**
 *
 * @author araLDAM
 */
public class LoanProcessor  {

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
    String LoanType;

    public LoanProcessor() {

        maxNoOfLoans = 3;
        this.loans = new ArrayList<LoanImpl>();
    }

    /**
     *@param
     * Creates a new loan Object using the parameters LoanId, loan amount,
     * loan borrowed date, due date and the loan duration.Here check weather the maximum no of loans
     * that can be borrowed by a employee is exceeded before creating a loan Object.
     */
    public boolean addLoan(String loanType,String loanId, double loanAmount, String borrowedDate, String dueDate, int loanDuration){

        if (noOfLoansBorrowed < 3) {
            if(LoanType=="Housing Loan"){
              if(loanProc.checkIfRequestedtypeLoanBorrowed(loanType)==true){
                return false;
              }
              else {
              LoanImpl newLoan = new HousingLoan( loanType,loanId, loanAmount, borrowedDate, dueDate, loanDuration);
              loans.add(newLoan);
              noOfLoansBorrowed++;
              return true;
              }
            }

           else if(LoanType=="Wedding Loan"){
                if(loanProc.checkIfRequestedtypeLoanBorrowed(loanType)==true){
                return false;
              }
              else {
              LoanImpl newLoan = new WeddingLoan( loanType,loanId, loanAmount, borrowedDate, dueDate, loanDuration);
              loans.add(newLoan);
              noOfLoansBorrowed++;
              return true;
              }
              }

           else if(LoanType=="Travel Loan"){
                if(loanProc.checkIfRequestedtypeLoanBorrowed(loanType)==true){
                return false;
              }
              else {
              LoanImpl newLoan = new TravelLoan( loanType,loanId, loanAmount, borrowedDate, dueDate, loanDuration);
              loans.add(newLoan);
              noOfLoansBorrowed++;
              return true;
              }
              }

        }
            return false;
           
    }


    public boolean checkIfRequestedtypeLoanBorrowed(String loanType){
        for (int i=0;i<loans.size();i++){
            if(loanType.equals(loans.get(i).getLoanType())){
                return true;
            }
            
        }
        return false;
     }

    /**
     *
     * @param
     * Edit a particular loan details of a employee. Since employee can have maximum three loans
     * LoanId will be used to find the correct loan from the Loans Array list.
     */
    public void EditLoanDetails(String loanId, double loanAmount, String borrowedDate, String dueDate, int loanDuration) {
        for (int i = 0; i < loans.size(); i++) {
            LoanImpl tempLoan = null;
            if (tempLoan.getLoanId().equals(loanId)) {
                tempLoan = loans.get(i);

                tempLoan.setLoanId(loanId);
                tempLoan.setLoanAmount(loanAmount);
                tempLoan.setBorrowedDate(borrowedDate);
                tempLoan.setDueDate(dueDate);

                loans.add(i, tempLoan);
            }
        }
    }

    /**
     * Used to View the all loan details of particular employee.
     * Loan Details are passed as as arrayList
     *
     */
    public ArrayList<String> viewLoanDetails() {
        for (int i = 0; i < loans.size(); i++) {
            LoanImpl loanTemp = null;
            loanTemp = loans.get(i);

            loanDetails.add(loanTemp.getLoanId());
            loanDetails.add(String.valueOf(loanTemp.getLoanAmount()));
            loanDetails.add(loanTemp.getBorrowedDate().toString());
            loanDetails.add(loanTemp.getDuedDate().toString());
        }
        return loanDetails;
    }

    /**
     *
     * @param loanID
     * Used to remove a particular loan record. LoanId is used to search the
     * loan recored and if found loan record will be removed from the Loans arrayList
     */
    public void removeLoanDetails(String loanID) {
        for (int i = 0; i < loans.size(); i++) {
            if (loans.get(i).getLoanId().equals(loanID)) {
                loans.remove(i);

            }
        }
    }

    /**
     *
     * @returns the no of loans borrowed by a particular employee
     */
    public int getNoofLoansBorrowed() {
        return noOfLoansBorrowed;
    }

    /**
     *
     * @param loans
     * @returns the monthly sum of loans belongs  to a particular employee
     */
    public double getMonthlySum(ArrayList<LoanImpl> loans) {
        double monthlyLoanSum = 0;
        for (int i = 0; i < 3; i++) {
            monthlyLoanSum = +loanProc.getMonthlyPayPerLoan(loans.get(i));
        }

        return monthlyLoanSum;
    }
    /**
     *
     * @param loans the monthly
     * @returns the value which should be paid for a loan in a period of month
     */
    public double getMonthlyPayPerLoan(LoanImpl loan) {
        double monthlySumPerLoan = 0;
        if (loan != null) {
            monthlySumPerLoan = loanProc.getLoanAmountPerLoan(loan) / (loan.getLoanDuration() - loan.getNoOfMonthsPaid());
        }
        return monthlySumPerLoan;
    }

    /**
     *
     * @param loans
     * @returns the total loan amount to be paid by a employee
     */
    public double getTotalLoanAmount(ArrayList<LoanImpl> loans) {
        double loanAmount = 0;
        for (int i = 0; i < 3; i++) {
            totalLoanAmount = loanProc.getLoanAmountPerLoan(loans.get(i));
        }
        return totalLoanAmount;

    }

    /**
     *
     * @param loan
     * @returns the loan amount to be paid for a particular loan,
     * belongs to a employee
     */
    public double getLoanAmountPerLoan(LoanImpl loan) {
        double loanAmount;
        loanAmount = loan.getLoanAmount();
        
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

    
 }

