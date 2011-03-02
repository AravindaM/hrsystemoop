/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions.updates;

import hrsystemoop.modle.Employee;
import hrsystemoop.modle.EmployeeImpl;
import hrsystemoop.modle.Level;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author toshiba
 */
public class UpdateSelfNameCommandTest {

    private static Employee createMockEmployee(int i) {

       return new EmployeeImpl("someone" + i, Level.LEVELONE, "uname" + i, "pass" + (i * 37), i * 7);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of update method, of class UpdateSelfNameCommand.
     */
    @Test
    public void testUpdateName() throws Exception {
        System.out.println("update Name");
        String attribValue = "dfdsf";
        int id = 1;
        Employee currentUser = createMockEmployee(1);
        UpdateSelfNameCommand instance = new UpdateSelfNameCommand();
        instance.update(attribValue, currentUser);
        assertEquals(currentUser.getName(), attribValue);
    }
}
