/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.ShowSelfIDCommand;
import hrsystemoop.actions.UserCommands;

/**
 *
 * @author prasath
 */
public class HRManagerImpl {

    static final UserCommands commands = new UserCommands(new Command[]{
        new ShowSelfIDCommand()
        //acceptleave command, add remove update employee employeee

    });

}
