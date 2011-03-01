/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystemoop;

import hrsystemoop.database.exeption.DatabaseExeption;
import java.util.*;

    import hrsystemoop.database.*;
import hrsystemoop.modle.Employee;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Amila Manoj
 */
public class HRMain {

    private Scanner scanner;
    private Database database;
    private Employee loggedEmployee;
    public HRMain() {
        this.scanner = new Scanner(System.in);
        this.database=database.getInstance();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HRMain main = new HRMain();
        main.run();
    }

    public void run() {
        while (true) {
            System.out.println("Welcome to TechNinja Human Resourse Management System");
            System.out.println("=====================================================");
            System.out.println("1 - Login");
            System.out.println("2 -Exit");
            int command = scanner.nextInt();
            switch (command) {
                case 0:
                    showLogin();
                    break;
                case 1:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Command. Try again");
                    break;
            }
        }
    }

        public void showLogin(){
            System.out.println("Enter your username and passord below");
            System.out.print("Username:");
            String username = scanner.nextLine();
            System.out.print("Password:");
            String password = scanner.nextLine();
        try {
            loggedEmployee = database.getEmployee(username);
            if (loggedEmployee.checkPass(password)){
                showLoggedUI();
            } else {
                System.out.println("The password you provided is incorrect");
            }
        } catch (DatabaseExeption ex) {
            System.out.println("There is no such user named "+ username);
        }

        }

        public void showLoggedUI(){
            System.out.println("Welcome "+ loggedEmployee.getName());
            System.out.println("====================================");
            
        }


    }
