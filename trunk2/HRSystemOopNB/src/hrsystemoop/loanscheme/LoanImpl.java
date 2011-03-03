/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.loanscheme;

/**
 *
 * @author araLDAM
 */
public class LoanImpl implements LoanInt {
    private String loanType;
    private String loanId;
    private String borrowedDate;
    private String dueDate;
    private double loanAmount;
    private int noOfLoansBorrowed;
    private int noOfMonthsPaid;
    private double installementValue;
    private double loanDuration;

    public LoanImpl(String loanType,String loanId, double loanAmount, String borrowedDate, String dueDate, int loanDuration) {
        this.loanType = loanType;
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
        this.loanDuration = loanDuration;
        noOfLoansBorrowed=+1;
    }

    /**
     * @return the loanId
     */
    public String getLoanId() {
        return loanId;
    }

    /**
     * @param loanId the loanId to set
     */
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    /**
     * @return the borrowedDate
     */
    public String getBorrowedDate() {
        return borrowedDate;
    }

    /**
     * @param borrowedDate the borrowedDate to set
     */
    public void setBorrowedDate(String borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    /**
     * @return the duedDate
     */
    public String getDuedDate() {
        return dueDate;
    }

    /**
     * @param duedDate the duedDate to set
     */
    public void setDueDate(String duedDate) {
        this.dueDate = duedDate;
    }

    /**
     * @return the loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @return the noOfMonthsPaid
     */
    public int getNoOfMonthsPaid() {
        return noOfMonthsPaid;
    }

    /**
     * @param noOfMonthsPaid the noOfMonthsPaid to set
     */
    public void setNoOfMonthsPaid(int noOfMonthsPaid) {
        this.noOfMonthsPaid = noOfMonthsPaid;
    }

    /**
     *
     * @returns the value of a installment for a particular loan
     */
    public double getValueOfAInstallement(){
    installementValue = loanAmount/getLoanDuration();

    return installementValue;
    }

    /**
     * @return the loanDuration
     */
    public double getLoanDuration() {
        return loanDuration;
    }

    /**
     * @param loanDuration the loanDuration to set
     */
    public void setLoanDuration(double loanDuration) {
        this.loanDuration = loanDuration;
    }

    /**
     * @return the loanType
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * @param loanType the loanType to set
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }



}
