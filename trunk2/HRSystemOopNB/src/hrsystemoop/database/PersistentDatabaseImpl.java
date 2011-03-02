/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toshiba
 */
public class PersistentDatabaseImpl extends DatabaseImpl {

    private File file;
    private final static Logger LOGGER = Logger.getLogger(PersistentDatabaseImpl.class.getName());

    protected PersistentDatabaseImpl(File file) {
        this.file = file;
    }

    public void inti() {
        ObjectInputStream oos = null;
        try {
            oos = new ObjectInputStream(new FileInputStream(file));
            maxId = oos.readInt();
            oos.close();
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
            }
        }
    }
}
