/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.modle;

import hrsystemoop.Level;
import hrsystemoop.actions.UserCommands;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

/**
 * @author Amila Manoj, Prasath
 */
public class EmployeeImpl implements Employee {

    private int  Id;
    private String name;
    private Level level;
    private String userName;
    private String passwordHash;

    public EmployeeImpl(String name, Level level, String userName) {
        this.name = name;
        this.level = level;
        this.userName = userName;
        this.passwordHash = getHash(passwordHash);
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

    public boolean checkPass(String password) {
        if(getHash(password).equals(this.passwordHash)){
            return true;
        } else {
            return false;
        }
    }

    public UserCommands getUserCommands() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getHash(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            byte[] input = digest.digest(password.getBytes("UTF-8"));
            return new String(input);
        } catch (UnsupportedEncodingException ex) {
            return  null;
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }
     
}
