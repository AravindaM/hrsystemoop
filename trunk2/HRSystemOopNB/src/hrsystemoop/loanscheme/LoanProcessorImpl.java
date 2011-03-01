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
public class LoanProcessorImpl {
    private String userId;
    String details;
    ArrayList<LoanImpl>  loanDirectory;
    LoanImpl aLoan;

    public String viewLoanDetails(String userId){

    this.userId = userId;
    for (int i=0;i<loanDirectory.size();i++){
        aLoan = loanDirectory[i];
          if (userId == null ? aLoan.getBorrowerId() == null : userId.equals(aLoan.getBorrowerId())) {
          details = aLoan.getLoanId()+
                    aLoan.getLoanAmount()+
                    aLoan.getBorrowedDate()+
                    aLoan.getDuedDate()+
                    aLoan.getNoOfLoansBorrowed();
          }
    }

    return details;
    }



    public void addLoanDetails(String loanId,
            String loanBorrower,double amount,
            Date borrowedDate,Date dueDate,int noOfLoans){
    if(noOfLoans>3){
         System.out.println("No. of Loans allowed per user Exceeds");
    }else
    aLoan.setLoanId(loanId);
    aLoan.setBorrowerId(loanBorrower);
    aLoan.setLoanAmount(amount);
    aLoan.setBorrowedDate(borrowedDate);
    aLoan.setDuedDate(dueDate);

    loanDirectory.add(aLoan);

    }


    public void removeLoanDetails(String loanId){
        LoanImpl removeLoan;
        if (loanId!=null){
            for (int i=1;i<loanDirectory.size();i++)
                removeLoan = loanDirectory[i];
                    if (loanId==aloan.getLoanId()){
                    loanDirectory.remove(loanId.codePointAt(i));
                    }
        }
        //loanDirectory


    }






}
