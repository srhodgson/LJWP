package Chapter06.Exercises;

import java.util.Arrays;

public class Exercise05 {
    public static void main(String[] args){
        int[] ages = {35, 12, 56, 2, 37, 30};
        int totalAge = 0;

        for (int age : ages) {
            totalAge += age;
        }

        System.out.println("The average age of the dinosaurs in the park is: " + (double) totalAge / ages.length);

    }
}
