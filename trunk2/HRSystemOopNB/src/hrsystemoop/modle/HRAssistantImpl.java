/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.modle;

import hrsystemoop.actions.*;
import hrsystemoop.actions.showgloble.ShowGlobleAttendanceSummaryCommand;
import hrsystemoop.actions.showself.ShowSelfAttendanceFullDetailsCommand;
import hrsystemoop.actions.showself.ShowSelfAttendanceSummaryCommand;
import hrsystemoop.actions.showself.ShowSelfIDCommand;
import hrsystemoop.actions.showself.ShowSelfNameCommand;
import hrsystemoop.actions.showself.ShowSelfSalaryCommand;
import hrsystemoop.actions.showself.ShowSelfUserNameCommand;
import hrsystemoop.actions.showgloble.ShowGlobleNameCommand;
import hrsystemoop.actions.updates.UpdateSelfBirthdayCommand;
import hrsystemoop.actions.updates.UpdateSelfNameCommand;
import hrsystemoop.actions.updates.UpdateSelfUserNameCommand;

/**
 *
 * @author prasath
 */
public class HRAssistantImpl extends HREmployerImpl implements HRAssistant {

    static final UserCommands commands = new UserCommands(new Command[]{
                // updates commands
                new UpdateSelfBirthdayCommand(),
                new UpdateSelfUserNameCommand(),
                new UpdateSelfNameCommand(),
                new RequestMedicalLeaveCommand(),
                new RequestLoanCommand(),
                //show commands
                new ShowSelfAttendanceFullDetailsCommand(),
                new ShowSelfSalaryCommand(),
                new ShowSelfIDCommand(),
                new ShowSelfNameCommand(),
                new ShowSelfUserNameCommand(),
                new ShowSelfAttendanceSummaryCommand(),
                // unique commands
                new AddEmployeeCommand(),
                new AcceptLoanCommand(),
                new RemoveEmployeeCommand(),
                //globles
                new ShowGlobleNameCommand(),
                new ShowGlobleAttendanceSummaryCommand()
            });

    public HRAssistantImpl(String name, Level level, String userName, String userPassword, int age) {
        super(name, level, userName, userPassword, age);
    }

    public UserCommands getCommands() {
        return commands;
    }
}
