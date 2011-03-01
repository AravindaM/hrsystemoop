/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.database.exeption;

import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M. Perera
 */
public class EmployeeDoesNotExist extends DatabaseExeption {

    public EmployeeDoesNotExist(int id) {

        super("Employee does not with id=" + id);
    }

    public EmployeeDoesNotExist(String userName) {
      super("Employee does not with name=" + userName);
    }
}
