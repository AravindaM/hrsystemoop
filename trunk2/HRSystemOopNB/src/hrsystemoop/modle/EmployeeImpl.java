/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.modle;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.ShowSelfIDCommand;
import hrsystemoop.actions.UserCommands;
import hrsystemoop.attendancedata.MonthAttendance;
import hrsystemoop.loanscheme.LoanProcessor;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Prasath
 */
public class EmployeeImpl implements Employee {

    private int Id;
    private String name;
    private Level level;
    private String userName;
    private String passwordHash;
    private static final UserCommands commands = new UserCommands(new Command[]{ //TEMPORERY
                new ShowSelfIDCommand()
            });
    private LoanProcessor loanProcessor;
    private MonthAttendance monthAttendance;

    public EmployeeImpl(String name, Level level, String userName, String userPassword) {
        this.name = name;
        this.level = level;
        this.userName = userName;
        this.passwordHash = getHash(userPassword);
        loanProcessor = new LoanProcessor();
        monthAttendance = new MonthAttendance();
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int Id) {
        this.Id = Id;
    }

    public void setUserName(String uname) {
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
    public int getSalary(int overTime) {
        return (level.getSalary(overTime)) - ((monthAttendance.getTotalLeaves() - level.getMaxNoOfLeaves()) * (level.getLeavePenalty()));
    }

    public MonthAttendance getMonthAttendance() {
        return monthAttendance;
    }

    public LoanProcessor getLoanProcessor() {
        return loanProcessor;
    }

    public boolean requestLeave() {
        return true;
    }

    public boolean requestLoan() {
        return true;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
