package Chapter05;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        int x = 1;

        while (x <= 3) {
            System.out.println("Loop: " + x); // 1, 2, 3
            x++;
        }
        System.out.println("Final x value is: " + x); // 4

        int sum = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number (negative number to exit) -- > ");
            int n = sc.nextInt();
            if (n < 0) {
                keepGoing = false;
            } else {
                sum = sum + n; // sum += n
            }
        }
        System.out.println("Sum of numbers is: " + sum);
    }
}
