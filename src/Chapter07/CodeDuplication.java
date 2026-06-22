package Chapter07;

import java.util.Scanner;

public class CodeDuplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1..10) --> ");
        int number = sc.nextInt();
        if (number < 1 || number > 10) {
            System.out.println("Invalid number! " + number);
        }

        System.out.println("Enter a number (1..10) --> ");
        number = sc.nextInt();
        if (number < 1 || number > 10) {
            System.out.println("Invalid number! " + number);
        }

        System.out.println("Enter a number (1..10) --> ");
        number = sc.nextInt();
        if (number < 1 || number > 10) {
            System.out.println("Invalid number! " + number);
        }
    }
}
