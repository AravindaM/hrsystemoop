/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

import hrsystemoop.modle.Employee;
import java.util.ArrayList;

/**
 *
 * @author araLDAM
 */
public interface LoanProcessorInt {

    void EditLoanDetails(String loanId,double loanAmount,String borrowedDate,String dueDate);

    ArrayList<String> getLoanDetails();

    public void removeLoanDetails();

    public double getTotalLoanAmount(Employee employee);

    }


