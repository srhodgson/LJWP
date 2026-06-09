package Chapter04.Exercises;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in KG --> ");
        int weight = sc.nextInt();

        if (weight < 500) {
            System.out.println("This dinosaur needs two feeds a day.");
        } else if (weight >= 500 && weight < 1000) {
            System.out.println("This dinosaur needs three feeds a day.");
        } else if (weight >= 1000) {
            System.out.println("This dinosaur needs four feeds a day.");
        }
    }
}
