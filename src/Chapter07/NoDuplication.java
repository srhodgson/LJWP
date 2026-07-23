package Chapter07;

import java.util.Scanner;

public class NoDuplication {
    public static void main(String[] args) {
        int number = getNumber();
        number = getNumber();
        number = getNumber();
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (1..10) --> ");
        int number = sc.nextInt();
        if (number < 1 || number > 10) {
            System.out.println("Invalid number! " + number);
        }
        return number;
    }
}
