/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop.actions;


/**
 *
 * @author toshiba
 */
public class ShowSelfIDCommand implements Command {

    public void execute(CommandContext context) {
        int id=context.getCurrentuser().getId();
        context.setResults("Your id is: " + id);
        context.setReturnStatus(true);
    }

    public String[] getAtrributesList() {
        return new String[0];
    }

    public String getName() {
        return "Show My Id";
    }


}
