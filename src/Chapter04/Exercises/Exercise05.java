package Chapter04.Exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dinosaur's size --> ");
        String size = sc.next();

        switch(size){
            case "XS" -> System.out.println("This dinosaur should go in enclosure 1");
            case "S" -> System.out.println("This dinosaur should go in enclosure 3");
            case "M" -> System.out.println("This dinosaur should go in enclosure 2");
            case "L" -> System.out.println("This dinosaur should go in enclosure 4");
            case "XL" -> System.out.println("This dinosaur should go in enclosure 5");
            default -> System.out.println("Invalid size");
        }
    }
}
