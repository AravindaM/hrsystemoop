/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.AcceptLoanCommand;
import hrsystemoop.actions.AddEmployeeCommand;
import hrsystemoop.actions.Command;
import hrsystemoop.actions.RemoveEmployeeCommand;
import hrsystemoop.actions.RequestLeaveCommand;
import hrsystemoop.actions.RequestLoanCommand;

import hrsystemoop.actions.UserCommands;
import hrsystemoop.actions.show.ShowSelfAttendanceSummaryCommand;
import hrsystemoop.actions.show.ShowSelfIDCommand;
import hrsystemoop.actions.show.ShowSelfNameCommand;
import hrsystemoop.actions.show.ShowSelfSalaryCommand;
import hrsystemoop.actions.show.ShowSelfUserNameCommand;
import hrsystemoop.actions.updates.UpdateSelfBirthdayCommand;
import hrsystemoop.actions.updates.UpdateSelfNameCommand;
import hrsystemoop.actions.updates.UpdateSelfUserNameCommand;

/**
 *
 * @author prasath
 */
public class HRManagerImpl extends HREmployerImpl implements HRManager {

    static final UserCommands commands = new UserCommands(new Command[]{
        // updates commands
        new UpdateSelfBirthdayCommand(),
        new UpdateSelfUserNameCommand(),
        new UpdateSelfNameCommand(),

        new RequestLeaveCommand(),
        new RequestLoanCommand(),

        //show commands
        new ShowSelfSalaryCommand(),
        new ShowSelfIDCommand(),
        new ShowSelfNameCommand(),
        new ShowSelfUserNameCommand(),
        new ShowSelfAttendanceSummaryCommand(),

        // unique commands
        new AddEmployeeCommand(),
        new AcceptLoanCommand(),
        new RemoveEmployeeCommand(),
        

    });

    public HRManagerImpl(String name, Level level, String userName, String userPassword) {
        super(name, level, userName, userPassword);
    }

    @Override
    public UserCommands getUserCommands() {
        return commands;
    }

}
