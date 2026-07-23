package Chapter07.Exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name --> ");
        String name = sc.next();
        System.out.println("Enter the name of the dinosaur --> ");
        String dinosaur = sc.next();

        System.out.println(greeting(name, dinosaur));
    }

    public static String greeting(String name, String dinosaur) {
        return "Hello " + name + " you're in for a treat, " + dinosaur + " is really looking forward to meeting you!";

    }
}
