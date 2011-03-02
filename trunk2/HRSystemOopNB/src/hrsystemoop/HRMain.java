/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop;

import hrsystemoop.actions.Invoker;
import hrsystemoop.database.exeption.DatabaseExeption;
import java.util.*;

import hrsystemoop.database.*;
import hrsystemoop.modle.Employee;
import hrsystemoop.modle.EmployeeImpl;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amila Manoj
 */
public class HRMain {

    private Scanner scanner;
    private Invoker invoker = new Invoker();

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
            tempInst.addEmployee(new EmployeeImpl("saman gunarathna", hrsystemoop.modle.Level.LEVELTWO, "saman"));
        } catch (DatabaseExeption ex) {
            ex.printStackTrace();
        }
// </editor-fold>


        HRMain main = new HRMain();
        main.run();
    }

    public void run() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to TechNinja Human Resourse Management System");
            System.out.println("=====================================================");
            System.out.println("1 - Login");
            System.out.println("2 -Exit");
            System.out.print("Enter your choice: ");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    showLogin();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Command. Try again");
                    break;
            }
        }
    }

    public void showLogin() {
        System.out.println("Enter your username and passord below");
        System.out.print("Username: ");
        String username = scanner.next();
        //String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.next();
        if (invoker.validateUser(username)) {
            if (invoker.validatePassword(password)) {
                showLoggedUI();
            } else {
                System.out.println("The password you provided is incorrect");
            }
        } else {
            System.out.println("There is no such user named " + username);
        }

    }

    public void showLoggedUI() {
        while (true){
        System.out.println("Welcome ");
        System.out.println("====================================");
        Set<String> commands = invoker.getAvailabeCommands();
        System.out.println("Please select what you want to do:");
        int i = 0;
        String[] commandArr = (String[])commands.toArray();
        for (String command : commandArr) {
            System.out.println(i+ " - " + command);
            i++;
        }
        System.out.println(i+ "Logout");
        int action = scanner.nextInt();
        if (action==commandArr.length){
            break;
        } else {
            String selectedAction = commandArr[action];
            String[] attributes = invoker.getAttributesForCommand(selectedAction);
            HashMap<String,String> responseList = new HashMap();
            for (String attrib: attributes){
                System.out.print(attrib + ": ");
                responseList.put(attrib, scanner.next());
            }
            invoker.perform(selectedAction, responseList);
        }
        
        }
    }
}
