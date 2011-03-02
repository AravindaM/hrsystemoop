/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.loanscheme;

import java.util.Date;
import javax.xml.datatype.Duration;

/**
 *
 * @author araLDAM
 */
public class TravelLoan extends Loan {

private String travelLocation;
private Duration travelDuration;

public TravelLoan(String loanId, double loanAmount, Date borrowedDate, Date dueDate) {
        super(loanId, loanAmount, borrowedDate, dueDate); 

String loantype = "Travel";
    }
}
