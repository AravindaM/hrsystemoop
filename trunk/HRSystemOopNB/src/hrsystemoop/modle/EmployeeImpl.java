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

    private int  Id;
    private String name;
    private Level level;

    public EmployeeImpl(String name, Level level) {
        this.name = name;
        this.level = level;
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
    
}
