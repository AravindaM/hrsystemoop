/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.AcceptLoanCommand;
import hrsystemoop.actions.AddEmployeeCommand;
import hrsystemoop.actions.CheckSalaryCommand;
import hrsystemoop.actions.Command;
import hrsystemoop.actions.CommandContext;
import hrsystemoop.actions.RemoveEmployeeCommand;
import hrsystemoop.actions.RequestLeaveCommand;
import hrsystemoop.actions.RequestLoanCommand;

import hrsystemoop.actions.UserCommands;
import hrsystemoop.actions.show.ShowSelfAttendanceSummaryCommand;
import hrsystemoop.actions.show.ShowSelfCommand;
import hrsystemoop.actions.show.ShowSelfIDCommand;
import hrsystemoop.actions.show.ShowSelfNameCommand;

/**
 *
 * @author prasath
 */
public class HRManagerImpl extends HREmployerImpl implements HRManager {

    static final UserCommands commands = new UserCommands(new Command[]{
        new ShowSelfIDCommand(),
        
        new CheckSalaryCommand(),
        new RemoveEmployeeCommand(),
        new RequestLeaveCommand(),
        new RequestLoanCommand(),
        new ShowSelfAttendanceSummaryCommand(),
        new ShowSelfIDCommand(),
        new ShowSelfNameCommand(),

        // unique commands
        new AddEmployeeCommand(),
        new AcceptLoanCommand(),

    });

    public HRManagerImpl(String name, Level level, String userName, String userPassword) {
        super(name, level, userName, userPassword);
    }

    @Override
    public UserCommands getUserCommands() {
        return commands;
    }

}
