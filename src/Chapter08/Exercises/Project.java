package Chapter08.Exercises;

import java.util.Scanner;

public class Project {
    // Use Scanner for reading input from the user
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Project project = new Project();
        project.start();
    }

    public void start() {
        // This is the main loop of the application. It will keep running until the user decides to exit.
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            handleMenuChoice(choice);
        }
    }

    public void displayMenu() {
        System.out.println("Welcome to Mesozoic Eden Assistant!");
        System.out.println("1. Manage Dinosaurs");
        System.out.println("2. Manage Park Employees");
        System.out.println("3. Manage Tickets");
        System.out.println("4. Check Park Status");
        System.out.println("5. Handle Special Events");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Manage Dinosaurs");
                break;
            case 2:
                System.out.println("Manage Park Employees");
                break;
            case 3:
                System.out.println("Manage Tickets");
                break;
            case 4:
                System.out.println("Check Park Status");
                break;
            case 5:
                System.out.println("Handle Special Events");
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }
}
