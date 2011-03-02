/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.database.exeption;

/**
 *
 * @author toshiba
 */
public class DatabaseConflict extends DatabaseExeption {

    public DatabaseConflict(String conflictingField) {
        super("conflict with regard to " + conflictingField);
    }
}
