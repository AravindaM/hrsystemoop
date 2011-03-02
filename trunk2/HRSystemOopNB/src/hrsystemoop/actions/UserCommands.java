package hrsystemoop.actions;

import java.util.*;

/**
 *
 * this is immutable set of command.
 * each Employee should have UserCommands Object
 * @author R.C.M. Perera
 */
public class UserCommands {

    private Map<String, Command> commands;

    /**
     * construct a UserCommands all the Command in the give array
     * @param commandsArr array of Command objects to be included
     */
    public UserCommands(Command[] commandsArr) {
        commands = new TreeMap<String, Command>();
        for (Command command : commandsArr) {
            commands.put(command.getName(), command);
        }
    }

    /**
     * names of all the available commands
     * @return unmodifiable set of names
     */
    public Set<String> getAvailabeCommands() {
        return Collections.unmodifiableSet(commands.keySet());
    }

    /**
     * select a command by name
     * @param commandName name of the requested Command.
     * should be as same as <code>Command.getName(String)</code> value of the Command.
     * @return Command with the given name
     */
    public Command getCommand(String commandName) {
        return commands.get(commandName);
    }
}
