package hrsystemoop.database.exeption;

/**
 *
 * @author R.C.M. Perera
 */
public class DatabaseConflict extends DatabaseExeption {

    public DatabaseConflict(String conflictingField) {
        super("conflict with regard to " + conflictingField);
    }
}
