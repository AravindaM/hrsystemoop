/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.modle;

import hrsystemoop.Level;

/**
 *
 * @author R.C.M. Perera
 */
public interface Employee {

    int getId();

    void setID();

    String getName();

    void setName();

    Level getLevel();

    void setLevel(Level level);
}
