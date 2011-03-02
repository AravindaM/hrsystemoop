package hrsystemoop.actions;

import java.util.Collections;
import java.util.*;

/**
 *
 * @author R.C.M. Perera
 */
public class UserCommands {

    private Map<String, Command> commands;

    public UserCommands(Command[] commandsArr) {
        commands = new TreeMap<String, Command>();
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
