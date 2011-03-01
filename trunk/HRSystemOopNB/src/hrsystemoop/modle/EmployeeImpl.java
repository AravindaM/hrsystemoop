/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.modle;

import hrsystemoop.Level;

/**
 * @author Amila Manoj, Prasath
 */
public class EmployeeImpl implements Employee {

    private int Id;
    private String name;
    private Level level;

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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
