/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.loanscheme;

import java.util.Date;

/**
 *
 * @author araLDAM
 */
public class LoanImpl implements LoanInt {

    private String loanId;
    private Date borrowedDate;
    private Date dueDate;
    private double loanAmount;
    private int noOfLoansBorrowed;
    private int noOfMonthsPaid;
    private double installementValue;
    private double loanDuration;

    public LoanImpl(String loanId, double loanAmount, Date borrowedDate, Date dueDate, int loanDuration) {
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
    public Date getBorrowedDate() {
        return borrowedDate;
    }

    /**
     * @param borrowedDate the borrowedDate to set
     */
    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    /**
     * @return the duedDate
     */
    public Date getDuedDate() {
        return dueDate;
    }

    /**
     * @param duedDate the duedDate to set
     */
    public void setDueDate(Date duedDate) {
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

}
