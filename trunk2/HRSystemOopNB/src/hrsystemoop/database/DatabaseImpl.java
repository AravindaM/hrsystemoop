package hrsystemoop.database;

import hrsystemoop.database.exeption.DatabaseConflict;
import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.database.exeption.EmployeeDoesNotExist;
import hrsystemoop.modle.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author R.C.M. Perera
 */
public class DatabaseImpl extends Database {

    protected Map<Integer, Employee> data = new HashMap<Integer, Employee>();
    protected int maxId;

    protected DatabaseImpl() {
    }

    @Override
    public Employee getEmployee(int id) throws EmployeeDoesNotExist {
        Employee employee = data.get(id);
        if (employee == null) {
            throw new EmployeeDoesNotExist(id);
        }
        return employee.clone();
    }

    @Override
    public synchronized int addEmployee(Employee emp) throws DatabaseConflict {
        String userName = emp.getUserName();
        Collection<Employee> all = data.values();
        for (Employee employee : all) {
            if (employee.getUserName().equals(userName)) {
                throw new DatabaseConflict("username = " + userName);
            }
        }
        maxId++;
        emp.setID(maxId);
        data.put(maxId, emp.clone());
        return maxId;
    }

    @Override
    public synchronized Employee deleteEmployee(int id) throws EmployeeDoesNotExist {
        Employee employee = data.get(id);
        if (employee == null) {
            throw new EmployeeDoesNotExist(id);
        }
        return data.remove(id);
    }

    @Override
    public synchronized void updateEmployee(int id, Employee emp) throws EmployeeDoesNotExist, DatabaseConflict {
        String userName = emp.getUserName();
        Collection<Employee> all = data.values();
        for (Employee employee : all) {
            if (employee.getUserName().equals(userName) && employee.getId() != id) {
                throw new DatabaseConflict("username = " + userName);
            }
        }
        if (!data.containsKey(id)) {
            throw new EmployeeDoesNotExist(id);
        }
        if (emp.getId() == id) {
            data.put(emp.getId(), emp.clone());
        } else {
            data.remove(id);
            data.put(emp.getId(), emp.clone());
        }
    }

    @Override
    public Employee getEmployee(String userName) throws DatabaseExeption {
        Collection<Employee> all = data.values();
        for (Employee employee : all) {
            if (employee.getUserName().equals(userName)) {
                return employee.clone();
            }
        }
        throw new EmployeeDoesNotExist(userName);
    }
}
