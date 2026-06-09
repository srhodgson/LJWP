package Chapter04.Exercises;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you job role --> ");
        String jobRole = sc.next();

        switch(jobRole) {
            case "Shopkeeper":
                System.out.println("Working in the shop.");
                break;
            case "Ranger":
                System.out.println("Patrolling the park.");
                break;
            case "Feeder":
                System.out.println("Feeding the animals.");
                break;
            default:
                System.out.println("Unknown job role.");
                break;
        }
    }
}
