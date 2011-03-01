package hrsystemoop.database;

import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M. Perera
 */
public abstract class Database {

    private static Database instance;

    protected Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new DatabaseImpl();
            return instance;
        } else {
            return instance;
        }
    }

    /**
     *
     * @param id id of the employee to be fetched from database
     * @return employee object which will when called  <code>getId()</code> will return the given id
     */
    public abstract Employee getEmployee(int id) throws DatabaseExeption;

    /**
     *
     * @param name User Name of the Employee
     *
     * @return if an Employee exists with that name Employee will be returned
     * @throws DatabaseExeption when a user dose not exist with that name exception will be thrown
     */
    public abstract Employee getEmployee(String name) throws DatabaseExeption;

    public abstract void updateEmployee(int id, Employee emp) throws DatabaseExeption;

    /**
     * adds a new Employee to the database.
     * but does not save(commit) it to actual database
     *
     * @param emp Employee to be added
     */
    public abstract int addEmployee(Employee emp) throws DatabaseExeption;

    public abstract Employee deleteEmployee(int id) throws DatabaseExeption;
}
