package Chapter07.Exercises;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the dinosaurs age --> ");
        int age = sc.nextInt();

        System.out.println(lifeStage(age));
    }

    public static String lifeStage(int age){
        String stage = "";
        if (age > 0 && age < 6) {
            stage = "The dinosaur is a hatchling.";
        } else if (age >= 6 && age < 10) {
            stage = "The dinosaur is a juvenile.";
        } else if (age >= 10) {
            stage = "The dinosaur is an adult.";
        } else {
            stage = "Invalid age entered.";
        }

        return stage;
    }
}
