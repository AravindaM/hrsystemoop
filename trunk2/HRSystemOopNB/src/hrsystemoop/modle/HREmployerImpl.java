/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.UserCommands;

/**
 *
 * @author prasath
 */
public abstract class HREmployerImpl extends EmployeeImpl implements HREmployer {

    public HREmployerImpl(String name, Level level, String userName, String userPassword) {
        super(name, level, userName, userPassword);
    }


}
