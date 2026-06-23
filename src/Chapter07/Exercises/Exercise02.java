package Chapter07.Exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dinosaur's weight --> ");
        double weight = sc.nextDouble();

        System.out.println("This dinosaur needs to eat " + dailyFood(weight) + "Kg of food a day.");

    }

    public static double dailyFood(double weight) {
        double food = 0.0;

        food = (0.25 * weight) * 0.75;


        return food;
    }
}
