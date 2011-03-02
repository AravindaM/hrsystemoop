/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.AcceptLoanCommand;
import hrsystemoop.actions.AddEmployeeCommand;
import hrsystemoop.actions.Command;
import hrsystemoop.actions.RemoveEmployeeCommand;
import hrsystemoop.actions.RequestLoanCommand;
import hrsystemoop.actions.RequestMedicalLeaveCommand;
import hrsystemoop.actions.UserCommands;
import hrsystemoop.actions.showgloble.ShowGlobleAttendanceSummaryCommand;
import hrsystemoop.actions.showgloble.ShowGlobleNameCommand;
import hrsystemoop.actions.showself.ShowSelfAttendanceFullDetailsCommand;
import hrsystemoop.actions.showself.ShowSelfAttendanceSummaryCommand;
import hrsystemoop.actions.showself.ShowSelfIDCommand;
import hrsystemoop.actions.showself.ShowSelfNameCommand;
import hrsystemoop.actions.showself.ShowSelfSalaryCommand;
import hrsystemoop.actions.showself.ShowSelfUserNameCommand;
import hrsystemoop.actions.updates.UpdateSelfBirthdayCommand;
import hrsystemoop.actions.updates.UpdateSelfNameCommand;
import hrsystemoop.actions.updates.UpdateSelfUserNameCommand;

/**
 *
 * @author prasath
 */
public class HRDirectorImpl extends HREmployerImpl implements HRDirector {

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

    public HRDirectorImpl(String name, Level level, String userName, String userPassword, int age) {
        super(name, level, userName, userPassword,age);
    }

}
