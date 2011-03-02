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

    /**
     * the Employee that is currently has the <code>id</code> will be replaced by <code>emp</code>
     * <br/> the newly updated Employee's id will also be updated to <code>emp.getID()</code>
     * @param id id of the Employee to be updated
     * @param emp Employee object that will replace the
     * @throws DatabaseExeption thrown if no Employee exist by given id
     */
    public abstract void updateEmployee(int id, Employee emp) throws DatabaseExeption;



    /**
     * adds a new Employee to the database.
     * but does not save(commit) it to actual database
     * <br/> new Employee's id will set to the Employee through <code>Employee.setID()</code>
     * @param emp Employee to be added
     * @return newly assigned id of the Employee
     * @throws DatabaseExeption thrown if there is conflicting user names
     */
    public abstract int addEmployee(Employee emp) throws DatabaseExeption;

    /**
     * delete the Employee with the given id
     * @param id id of the Employee to be deleted
     * @return deleted Employee
     * @throws DatabaseExeption thrown if no Employee exist by given id
     */
    public abstract Employee deleteEmployee(int id) throws DatabaseExeption;
}
