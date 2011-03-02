/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.database.exeption;

/**
 *
 * @author R.C.M. Perera
 */
public class EmployeeDoesNotExist extends DatabaseExeption {

	public EmployeeDoesNotExist(int id) {

		super("no Employee exist with id=" + id);
	}

	public EmployeeDoesNotExist(String userName) {
		super("no Employee exist with name=" + userName);
	}
}
