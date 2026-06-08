package Chapter04.Exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a species --> ");
        String species = sc.next();

        switch(species) {
            case "T-Rex":
                System.out.println("It is a T-Rex");
                break;
            case "Triceratops":
                System.out.println("It is a Triceratops");
                break;
            case "Velociraptor":
                System.out.println("It is a Velociraptor");
                break;
            default:
                System.out.println("Unknown species");
        }
    }
}
