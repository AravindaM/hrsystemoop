/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions.updates;

import hrsystemoop.modle.Employee;

/**
 *
 * @author toshiba
 */
public class UpdateSelfBirthdayCommand extends UpdateSelfCommand {


    public UpdateSelfBirthdayCommand() {
        super("birthday");
    }

    @Override
    public void update(String attribValue, Employee currentUser) {

    }

}
