
package hrsystemoop.actions;
/**
 *
 * @author Amila Manoj
 * Command interface that is used to execute a large number of commands
 */

public interface Command {
    
     /**
     * Executes the appropriate sequence of actions
     * depending on the implemented commands
      * @param context passes arguments needed to complete the action, if any and stores state and resluts
      *
     */
    public void execute(CommandContext context);

    /**
     * Returns the set of attributes that user need to input to perform
     * a particular command
     * @return array of attributes that is needed to execute this commend
     */
    public String[] getAtrributesList();

    /**
     * Returns the name of the command to display on screen
     * and UI display
     * @return Name of the command
     */
    public String getName();
}
