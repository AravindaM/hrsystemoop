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
public interface LoanInt {

    String getLoanId();

    void setLoanId(String loanId);

    Date getBorrowedDate();

    void setBorrowedDate(Date borrowedDate);


    Date getDuedDate();


    void setDueDate(Date duedDate);


    double getLoanAmount();

    void setLoanAmount(double loanAmount);

}
