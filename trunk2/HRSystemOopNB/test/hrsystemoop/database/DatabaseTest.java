/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.database;

import hrsystemoop.database.exeption.DatabaseConflict;
import hrsystemoop.database.exeption.DatabaseExeption;
import hrsystemoop.database.exeption.EmployeeDoesNotExist;
import hrsystemoop.modle.Employee;
import hrsystemoop.modle.EmployeeImpl;
import hrsystemoop.modle.Level;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author R.C.M. Perera
 */
public class DatabaseTest {

    Database instance;

    public DatabaseTest() {
        instance = Database.getInstance();
    }

    private static Employee createMockEmployee(int i) {
        return new EmployeeImpl("someone" + i, Level.LEVELONE, "uname" + i, "pass" + (i * 37), i * 7);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        System.out.println("set up");

        Employee emp = createMockEmployee(1);
        int id = Database.getInstance().addEmployee(emp);
        System.out.println("	added id=" + id + " emp=" + emp);

        emp = createMockEmployee(2);
        id = Database.getInstance().addEmployee(emp);
        System.out.println("	added id=" + id + " emp=" + emp);

        emp = createMockEmployee(3);
        id = Database.getInstance().addEmployee(emp);
        System.out.println("	added id=" + id + " emp=" + emp);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getInstance method, of class Database.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Database result = Database.getInstance();
        assertNotNull(result);
        Database result2 = Database.getInstance();
        assertEquals(result2, result);
    }

    /**
     * Test of getEmployee method, of class Database.
     */
    @Test
    public void testGetEmployee_int() throws Exception {
        System.out.println("getEmployee byID");
        int id = 1;
        Employee result = instance.getEmployee(id);
        assertNotNull(result);
        System.out.println("	retreved for id=" + id + " emp=" + result);
        assertEquals(id, result.getId());
    }

    /**
     * Test of getEmployee method, of class Database.
     */
    @Test
    public void testGetEmployee_String() throws Exception {
        System.out.println("getEmployee byUserName");
        String name = "uname1";
        Employee result = instance.getEmployee(name);
        assertNotNull(result);
        System.out.println("	retreved for uname=" + name + " emp=" + result);
        assertEquals(name, result.getUserName());
    }

    @Test(expected = EmployeeDoesNotExist.class)
    public void testGetEmployee_String_Error() throws Exception {
        instance.getEmployee("non existing user name");
    }

    /**
     * Test of updateEmployee method, of class Database.
     */
    @Test
    public void testUpdateEmployee() throws Exception {
        System.out.println("updateEmployee");

        int id = 3;
        System.out.println("	with same id, id=" + id);
        Employee emp = createMockEmployee(4);
        emp.setID(id);
        instance.updateEmployee(id, emp);
        Employee resalt = instance.getEmployee(id);
        assertNotNull(resalt);
        assertEquals(emp.getName(), resalt.getName());

        int diffId = 4488;
        System.out.println("	with diffrent id, id=" + diffId);
        emp = createMockEmployee(5);
        emp.setID(diffId);
        instance.updateEmployee(id, emp);
        resalt = instance.getEmployee(diffId);
        assertNotNull(resalt);
        assertEquals(emp.getName(), resalt.getName());
    }

    @Test(expected = DatabaseConflict.class)
    public void testUpdateEmployee_Conflict() throws Exception {
        System.out.println("UpdateEmployee with confiling user names");
        int id = 2;
        Employee emp = createMockEmployee(1);
        emp.setID(id);
        instance.updateEmployee(id, emp);
    }

    /**
     * Test of addEmployee method, of class Database.
     */
    @Test
    public void testAddEmployee() throws Exception {
        System.out.println("addEmployee");

        Employee emp = createMockEmployee(6);
        int result = instance.addEmployee(emp);
        assertTrue(result > 0);
        assertEquals(emp.getId(), result);
    }

    /**
     * Test of deleteEmployee method, of class Database.
     */
    @Test(expected = EmployeeDoesNotExist.class)
    public void testDeleteEmployee() throws Exception {
        System.out.println("deleteEmployee");
        int id = 1;
        Employee result = instance.deleteEmployee(id);
        assertNotNull(result);
        Employee emp = instance.getEmployee(id);
    }
}
