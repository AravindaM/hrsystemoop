/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.actions;

import hrsystemoop.database.*;
import hrsystemoop.modle.*;
import java.util.*;
/**
 *
 * @author TOSHIBA
 */
public class CommandContext {
    Employee currentuser;
    Map<String,String> argList;

    public CommandContext(Employee currentuser, Map<String, String> argList) {
        this.currentuser = currentuser;
        this.argList = argList;
    }

    public Map<String, String> getArgList() {
        return argList;
    }

    public Employee getCurrentuser() {
        return currentuser;
    }


}
