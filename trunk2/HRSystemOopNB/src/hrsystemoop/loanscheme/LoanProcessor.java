/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

/**
 *
 * @author prasath
 */
public interface LoanProcessor {

    public int getTotalLoan();

    /*
     * checks the monthly sum we have to pay and return it
     */
    public int getMonthlyPayment();

}
