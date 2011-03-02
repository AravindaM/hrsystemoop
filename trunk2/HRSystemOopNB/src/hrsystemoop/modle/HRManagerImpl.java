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
public class HRManagerImpl extends HREmployerImpl implements HRManager {

    static final UserCommands commands = new UserCommands(new Command[]{
        new ShowSelfIDCommand()
        //acceptleave command, add remove update employee employeee

    });

    public HRManagerImpl(String name, Level level, String userName, String userPassword) {
        super(name, level, userName, userPassword);
    }

    @Override
    public UserCommands getUserCommands() {
        return commands;
    }

    public HRManagerImpl() {
    }

    public String getTeam() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTeam() {
        throw new UnsupportedOperationException("Not supported yet.");
    }




}
