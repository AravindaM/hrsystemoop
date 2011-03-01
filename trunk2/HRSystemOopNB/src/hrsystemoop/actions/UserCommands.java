package hrsystemoop.actions;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author R.C.M. Perera
 */
public class UserCommands {

    private Map<String, Command> commands;

    public UserCommands(Command[] commandsArr) {
        for (Command command : commandsArr) {
            commands.put(command.getName(), command);
        }
    }

    public Set<String> getAvailabeCommands() {
        return Collections.unmodifiableSet(commands.keySet());
    }

    public Command getCommand(String commandName) {
        return commands.get(commandName);
    }
}