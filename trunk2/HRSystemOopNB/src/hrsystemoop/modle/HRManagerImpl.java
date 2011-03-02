/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.AddEmployeeCommand;
import hrsystemoop.actions.Command;

import hrsystemoop.actions.UserCommands;
import hrsystemoop.actions.show.ShowSelfIDCommand;

/**
 *
 * @author prasath
 */
public class HRManagerImpl extends HREmployerImpl implements HRManager {

    static final UserCommands commands = new UserCommands(new Command[]{
        new ShowSelfIDCommand()
        new AddEmployeeCommand()
        //acceptleave command, add remove update employee employeee

    });

    public HRManagerImpl(String name, Level level, String userName, String userPassword) {
        super(name, level, userName, userPassword);
    }

    @Override
    public UserCommands getUserCommands() {
        return commands;
    }





}
