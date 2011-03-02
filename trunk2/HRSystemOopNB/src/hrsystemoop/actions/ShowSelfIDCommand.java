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

    public CommandContext execute(CommandContext context) {
        int id=context.getCurrentuser().getId();
        context.setResults(new String[] {String.valueOf(id)});
        context.setReturnStatus(true);
        return context;
    }

    public String[] getAtrributesList() {
        return new String[0];
    }

    public String getName() {
        return "Show My Id";
    }


}
