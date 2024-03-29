/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.modle;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.RequestMedicalLeaveCommand;
import hrsystemoop.actions.RequestLoanCommand;
import hrsystemoop.actions.UserCommands;
import hrsystemoop.actions.showself.ShowSelfAttendanceFullDetailsCommand;
import hrsystemoop.actions.showself.ShowSelfAttendanceSummaryCommand;
import hrsystemoop.actions.showself.ShowSelfIDCommand;
import hrsystemoop.actions.showself.ShowSelfNameCommand;
import hrsystemoop.actions.showself.ShowSelfSalaryCommand;
import hrsystemoop.actions.showself.ShowSelfUserNameCommand;
import hrsystemoop.actions.updates.UpdateSelfBirthdayCommand;
import hrsystemoop.actions.updates.UpdateSelfNameCommand;
import hrsystemoop.actions.updates.UpdateSelfUserNameCommand;
import hrsystemoop.attendancedata.MonthAttendanceImpl;
import hrsystemoop.loanscheme.LoanProcessor;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * @author Prasath
 */
public class EmployeeImpl implements Employee {

	private int id;
	private String name;
	private Level level;
	private String userName;
	private String passwordHash;

        private int age;

	private static final UserCommands commands = new UserCommands(new Command[]{ //TEMPORERY
		
                // updates commands
                new UpdateSelfBirthdayCommand(),
                new UpdateSelfUserNameCommand(),
                new UpdateSelfNameCommand(),

                new RequestMedicalLeaveCommand(),
                new RequestLoanCommand(),

                //show commands
                new ShowSelfAttendanceFullDetailsCommand(),
                new ShowSelfSalaryCommand(),
                new ShowSelfIDCommand(),
                new ShowSelfNameCommand(),
                new ShowSelfUserNameCommand(),
                new ShowSelfAttendanceSummaryCommand()   
            });

	private LoanProcessor loanProcessor;
	private MonthAttendanceImpl monthAttendance;

    public EmployeeImpl(String name, Level level, String userName, String userPassword, int age) {
        this.age = age;
        this.name = name;
        this.level = level;
        this.userName = userName;
        this.passwordHash = getHash(userPassword);
        loanProcessor = new LoanProcessor();
        monthAttendance = new MonthAttendanceImpl();
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int Id) {
            this.id = Id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.passwordHash = getHash(password);
    }

    /*
     * Checks whether a given passwordHasjmatches with the current password hash
     */
    public boolean checkPass(String password) {
        if (getHash(password).equals(this.passwordHash)) {
            return true;
        } else {
            return false;
        }
    }

    public UserCommands getUserCommands() {
        return commands;
    }

    private String getHash(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.reset();
            byte[] input = digest.digest(password.getBytes("UTF-8"));
            BigInteger bigInt = new BigInteger(1, input);
            String hashtext = bigInt.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (UnsupportedEncodingException ex) {
            return null;
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }

	/*
	 * final salary = (basesalary+overtimerate*overtime)-(loansum+extraleave*leavepenalty)
	 */
    public int getSalary() {
        monthAttendance.resetAdditonalLeaves(level.getMaxNoOfLeaves());
        return (level.getSalary(monthAttendance.getTotalOTHours()))-((monthAttendance.getTotalLeaves()-level.getMaxNoOfLeaves())*(level.getLeavePenalty()));
    }

    public MonthAttendanceImpl getMonthAttendance() {
        return monthAttendance;
    }

    public LoanProcessor getLoanProcessor() {
        return loanProcessor;
    }

    @Override
    public Employee clone() {
        try {
            EmployeeImpl clone = (EmployeeImpl) super.clone();
            clone.loanProcessor = (LoanProcessor) loanProcessor.clone();
            clone.monthAttendance = (MonthAttendanceImpl) monthAttendance.clone();
            return clone ;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    public int getAge() {
        return age;
    }


}
