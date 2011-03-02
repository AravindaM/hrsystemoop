/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.Command;
import hrsystemoop.actions.UserCommands;
import java.util.Date;

/**
 *
 * @author prasath
 */
public abstract class HREmployerImpl extends EmployeeImpl implements HREmployer {

    public HREmployerImpl(String name, Level level, String userName, String userPassword, Date birthDate) {
        super(name, level, userName, userPassword, birthDate);
    }


}
