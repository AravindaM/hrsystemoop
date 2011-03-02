/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import hrsystemoop.actions.*;
import java.util.Date;


/**
 *
 * @author prasath
 */
public class HRAssistantImpl extends HREmployerImpl implements HRAssistant {

    static final UserCommands commands = new UserCommands(new Command[]{
        // commands

    });

    public HRAssistantImpl(String name, Level level, String userName, String userPassword, int age) {
        super(name, level, userName, userPassword, age);
    }

    public  UserCommands getCommands() {
        return commands;
    }
    

}
