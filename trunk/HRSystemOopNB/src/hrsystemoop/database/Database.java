package hrsystemoop.database;

import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M. Perera
 */
public abstract class Database {

    private Database instance;

    protected Database() {
    }

    public Database getInstance() {
        if (instance == null) {
            instance = new DatabaseImpl();
        }
        return instance;
    }

    public abstract Employee getEmployee(int id) throws DatabaseExeption;

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
