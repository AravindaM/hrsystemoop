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
public class Loan {
 private String loanId;
 private String borrowerId;
 private Date borrowedDate;
 private Date duedDate;
 private double loanAmount;
 private double interestRate;
 private int noOfLoansBorrowed;

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
     * @return the borrowerId
     */
    public String getBorrowerId() {
        return borrowerId;
    }

    /**
     * @param borrowerId the borrowerId to set
     */
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
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
        return duedDate;
    }

    /**
     * @param duedDate the duedDate to set
     */
    public void setDuedDate(Date duedDate) {
        this.duedDate = duedDate;
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
     * @return the interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * @return the noOfLoansBorrowed
     */
    public int getNoOfLoansBorrowed() {
        return noOfLoansBorrowed;
    }

    /**
     * @param noOfLoansBorrowed the noOfLoansBorrowed to set
     */
    public void setNoOfLoansBorrowed(int noOfLoansBorrowed) {
        this.noOfLoansBorrowed = noOfLoansBorrowed;
    }

}
