/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.*;


/**
 *
 * @author prasath
 */
public class HRAssistantImpl {
    static final UserCommands commands = new UserCommands(new Command[]{
        new AddEmployeeCommand()

    });
}
