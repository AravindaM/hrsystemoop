/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions.updates;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.modle.Employee;

/**
 *
 * @author R.C.M.Perera
 */
public class UpdateSelfNameCommand extends UpdateSelfCommand {

    public UpdateSelfNameCommand() {
        super("name");
    }

    @Override
    public void update(String attribValue, Employee currentUser) {
        currentUser.setName(attribValue);
    }

}
