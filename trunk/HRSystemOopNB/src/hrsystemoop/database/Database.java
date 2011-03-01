/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.database;

import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M. Perera
 */
public abstract class Database {

    private Database instance;

    public Database getInstance() {
        return instance;
    }

    public abstract Employee getEmployee(int id);

    /**
     *
     * @param id id of the employee to be fetched from database
     * @return employee object which will when called  <code>getId()</code> will return the given id
     */
    public abstract Employee updateEmployee(int id);

    /**
     * adds a new Employee to the database.
     * but does not save(commit) it to actual database
     *
     * @param emp Employee to be added
     */
    public abstract void addEmployee(Employee emp);

    public abstract Employee deleteEmployee(int id);
}
