/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.database;

import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.database.exeption.EmployeeDoesNotExist;
import hrsystemoop.modle.Employee;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author R.C.M. Perera
 */
public class DatabaseImpl extends Database {

    private Map<Integer, Employee> data = new HashMap<Integer, Employee>();

    protected DatabaseImpl() {
    }

    @Override
    public Employee getEmployee(int id) throws EmployeeDoesNotExist {
        Employee employee = data.get(id);
        if (employee == null) {
            throw new EmployeeDoesNotExist(id);
        }
        return employee;
    }

    @Override
    public synchronized void addEmployee(Employee emp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public synchronized Employee deleteEmployee(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public synchronized void updateEmployee(int id, Employee emp) throws DatabaseExeption {
        if (data.containsKey(id)) {
            throw new EmployeeDoesNotExist(id);
        }
        if (emp.getId() == id) {
            data.put(emp.getId(), emp);
        } else {
            data.remove(id);
            data.put(emp.getId(), emp);
        }
    }
}
