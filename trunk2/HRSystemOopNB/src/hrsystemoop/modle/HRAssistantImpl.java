/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.*;
import hrsystemoop.actions.show.ShowSelfAttendanceFullDetailsCommand;
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

    });

    public HRAssistantImpl(String name, Level level, String userName, String userPassword, int age) {
        super(name, level, userName, userPassword, age);
    }

    public  UserCommands getCommands() {
        return commands;
    }
    

}
