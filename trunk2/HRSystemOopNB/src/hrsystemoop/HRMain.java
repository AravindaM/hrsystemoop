package hrsystemoop;

import hrsystemoop.actions.CommandContext;
import hrsystemoop.actions.Invoker;
import hrsystemoop.database.exeption.DatabaseExeption;
import java.io.*;
import java.util.*;

import hrsystemoop.database.*;
import hrsystemoop.modle.HRManagerImpl;

/**
 *
 * @author Amila Manoj
 * Command line user interface (client)
 */
public class HRMain {

    private Scanner scanner;
    private Invoker invoker = new Invoker();
    private int command;

    public HRMain() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // <editor-fold defaultstate="collapsed" desc="Temp Employee , remove later">
        Database tempInst = Database.getInstance();
        try {
            tempInst.addEmployee(new HRManagerImpl("saman gunarathna", hrsystemoop.modle.Level.LEVELTWO, "saman", "pw", 35));
        } catch (DatabaseExeption ex) {
            ex.printStackTrace();
        }
        // </editor-fold>

        HRMain main = new HRMain();
        main.run();
    }

    /**
     * starts the UI
     */
    public void run() {
        while (true) {
            System.out.println();
            System.out.println("=====================================================");
            System.out.println("Welcome to TechNinja Human Resourse Management System");
            System.out.println("=====================================================");
            System.out.println("Please select a command below");
            System.out.println("1 - Login");
            System.out.println("2 -Exit");
            System.out.print("Enter your choice: ");

            try {
                command = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("[ERROR]: Invalid Command. Try again");
                scanner.next();
                continue;
            }
            switch (command) {
                case 1:
                    showLogin();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("[ERROR]: Invalid Command. Try again");
                    break;
            }
        }
    }

    /**
     * displays the login UI and process inputs
     */
    public void showLogin() {
        System.out.println("Enter your username and passord below");
        System.out.print("Username: ");
        String username = scanner.next();
        System.out.print("Password: ");
        Console console = System.console();
        String password;
        if (console != null) {
            password = new String(console.readPassword());
        } else {
            password = scanner.next();
        }
        if (invoker.validateUser(username)) {
            if (invoker.validatePassword(password)) {
                showLoggedUI();
            } else {
                System.out.println("[ERROR]: The password you provided is incorrect");
            }
        } else {
            System.out.println("[ERROR]: There is no such user named " + username);
        }

    }

    /**
     * Displays the screen of possible actions after logging in
     * will revert to logic screen after logging out
     * depends on the type of user who's logged in
     */
    public void showLoggedUI() {
        System.out.println("Welcome ");
        Set<String> commandNames = invoker.getAvailabeCommands();
        while (true) {
            System.out.println("====================================");
            System.out.println("Please select what you want to do:");
            int i = 0;

            // Prints all the available actions
            String[] commandNamesArr = commandNames.toArray(new String[0]);
            for (String commandName : commandNamesArr) {
                System.out.println(i + " - " + commandName);
                i++;
            }
            System.out.println(i + " - Logout");
            System.out.print("Enter your choice: ");
            int action = scanner.nextInt();
            if (action < 0 || action > commandNamesArr.length) {
                System.out.println("[ERROR]: No such command");
            } else if (action == commandNamesArr.length) {
                //logout command
                break;
            } else {
                String selectedAction = commandNamesArr[action];
                // here we arrange information for the relevant command and added it to the response list string array
                String[] attributes = invoker.getAttributesForCommand(selectedAction);
                HashMap<String, String> responseList = new HashMap();
                for (String attrib : attributes) {
                    System.out.print(attrib + ": ");
                    responseList.put(attrib, scanner.next());
                }

                // now that we collected all the attribute we are nwo ready to preform that action
                CommandContext context = invoker.perform(selectedAction, responseList);

                if (context.getReturnStatus() == false) {
                    System.out.println("[ERROR]: There was an error executing that command");
                } else {


                    String results = context.getResults();
                    if (results != null) {
                        System.out.println(results);
                    }
                    System.out.println("[INFO]: Acton sucessully completed. Press any key to continue...");
                    try {
                        System.in.read();
                    } catch (IOException ex) {
                    }
                }
            }
        }
    }
}
