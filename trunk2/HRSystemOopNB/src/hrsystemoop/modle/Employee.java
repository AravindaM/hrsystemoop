/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.modle;

import hrsystemoop.actions.UserCommands;
import hrsystemoop.attendancedata.MonthAttendance;
import hrsystemoop.loanscheme.LoanProcessorImpl;

/**
 *
 * @author R.C.M. Perera
 */
public interface Employee {

    int getId();

    void setID(int Id);

    String getName();

    void setName(String name);

    void setUserName(String uname);

    String getUserName();

    void setPassword(String password);

    boolean checkPass(String password);

    Level getLevel();

    void setLevel(Level level);

    UserCommands getUserCommands();

    int getSalary(int overTime);

    MonthAttendance getMonthAttendance();

    LoanProcessorImpl getLoanProcessor();
}
