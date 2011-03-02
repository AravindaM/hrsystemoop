/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.modle;

import hrsystemoop.actions.UserCommands;
import hrsystemoop.attendancedata.MonthAttendanceImpl;
import hrsystemoop.loanscheme.LoanProcessor;
import java.util.Date;

/**
 *
 * @author R.C.M. Perera
 */
public interface Employee extends Cloneable {

    /**
     * get user id,
     * this unique if the Employee is committed to the database
     * @return user id
     */
    int getId();

    /**
     * set the id.this will be automatically reseted by the database to unique value at adding
     * any value setted before that will be discarded
     * @param id id to set
     */
    void setID(int id);

    /**
     * used to get full name of the Employee
     * not guaranteed to be unique
     * @return name of the Employee
     */
    String getName();

    /**
     * used to set full name of the Employee
     * @param name name to be set, no need to be unique
     */
    void setName(String name);

    /**
     * used to set login name of the Employee
     * Database commits will fail if this is not unique
     * @param uname new user name to be set
     */
    void setUserName(String uname);

    /**
     * used to get login name of the Employee
     * this unique if the Employee is committed to the database
     * @return user name of the Employee
     */
    String getUserName();

    /**
     * will set the login password of the user
     * @param password new password to be set
     */
    void setPassword(String password);

    /**
     * check the password against the stored password hash
     * @param password password to be checked
     * @return if the hash check files <code>false</code> otherwise <code>true</code>
     */
    boolean checkPass(String password);

    Level getLevel();

    void setLevel(Level level);

    UserCommands getUserCommands();

    int getSalary();

    MonthAttendanceImpl getMonthAttendance();

    LoanProcessor getLoanProcessor();

    Employee clone();

    int getAge();
}
