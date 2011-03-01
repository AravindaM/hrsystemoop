/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions;

import hrsystemoop.modle.Employee;
import java.util.Map;

/**
 *
 * @author toshiba
 */
public class ShowSelfIDCommand implements Command {

    public boolean execute(Map<String, String> argList, Employee currentUser) {
        System.out.println(currentUser.getId());
        return true;
    }

    public String[] getAtrributesList() {
        return new String[0];
    }

    public String getName() {
        return "Show My Id";
    }
}
