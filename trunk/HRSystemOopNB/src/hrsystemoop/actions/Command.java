/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

/**
 *
 * @author Amila Manoj
 */
/* The Command interface */
public interface Command {
    
     /**
     * Executes the appropriate sequence of actions
     * depending on the implemented commands
     */
    void execute();
}
