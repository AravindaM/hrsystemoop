/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.database;

import hrsystemoop.database.exeption.DatabaseConflict;
import hrsystemoop.database.exeption.EmployeeDoesNotExist;
import hrsystemoop.modle.Employee;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * this is a database initializable using a data file.
 * <code>init()</code> should be called before calling any other method.
 * will ignore all IO Exceptions and fall-back to <code>DatabaseImpl</code> behavior
 * @author R.C.M.Perera
 */
public class PersistentDatabaseImpl extends DatabaseImpl {

    private File file;
    private final static Logger LOGGER = Logger.getLogger(PersistentDatabaseImpl.class.getName());

    protected PersistentDatabaseImpl(File file) {
        this.file = file;
    }

    public void commit() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeInt(maxId);
            oos.writeObject(data);
            oos.close();
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
    }

    public void inti() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            maxId = ois.readInt();
            data = (Map<Integer, Employee>) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
            }
        }
        if (data == null) {
            data = new HashMap<Integer, Employee>();
        }
    }

    @Override
    public synchronized int addEmployee(Employee emp) throws DatabaseConflict {
        int r = super.addEmployee(emp);
        commit();
        return r;
    }

    @Override
    public synchronized Employee deleteEmployee(int id) throws EmployeeDoesNotExist {
        Employee e = super.deleteEmployee(id);
        commit();
        return e;
    }

    @Override
    public synchronized void updateEmployee(int id, Employee emp) throws EmployeeDoesNotExist, DatabaseConflict {
        super.updateEmployee(id, emp);
        commit();
    }
}
