/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.database;

import hrsystemoop.database.exeption.EmployeeDoesNotExist;
import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.modle.Employee;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author R.C.M. Perera
 */
public class DatabaseImpl extends Database {

    private Map<Integer, Employee> data = new HashMap<Integer, Employee>();

    protected  DatabaseImpl() {
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
    public Employee updateEmployee(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addEmployee(Employee emp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Employee deleteEmployee(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
