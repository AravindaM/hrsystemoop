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

    void setID(int Id);

    String getName();

    void setName(String name);

    Level getLevel();

    void setLevel(Level level);
}
