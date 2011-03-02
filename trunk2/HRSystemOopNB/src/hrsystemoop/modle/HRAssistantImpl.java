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
public class HRAssistantImpl extends HREmployerImpl implements HRAssistant {

    static final UserCommands commands = new UserCommands(new Command[]{
        // commands

    });

    public HRAssistantImpl(String name, Level level, String userName, String userPassword) {
        super(name, level, userName, userPassword);
    }

    public  UserCommands getCommands() {
        return commands;
    }
    

}
