package Chapter04;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sport --> ");
        String sport = sc.next();
        switch(sport) {
            case "Football":
                System.out.println("I play football");
                break;
            case "Rugby":
                System.out.println("I play rugby");
                break;
            default:
                System.out.println("Unknown sport");
                break;
        }
    }

}
