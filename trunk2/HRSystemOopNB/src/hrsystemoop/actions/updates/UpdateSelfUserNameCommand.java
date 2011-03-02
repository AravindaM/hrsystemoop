package hrsystemoop.actions.updates;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 */
public class UpdateSelfUserNameCommand extends UpdateSelfCommand {

    public UpdateSelfUserNameCommand() {
        super("user name");
    }

    @Override
    public void update(String attribValue, Employee currentUser) {
        currentUser.setUserName(attribValue);
    }
}
