/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.model;

import hrsystemoop.Level;
import hrsystemoop.actions.UserCommands;

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

    int getSalary();

    // all type of leave must be supported here so there would be threee constructors
    int noOfLeaves();

    int noOfShortLeaves();

    int noOfCasualLeaves();

    

}
