package Chapter04.Exercises;

public class Exercise04 {
    public static void main(String[] args) {
        int safetyRating = 7;
        int safetyThreshold = 6;

        if (safetyRating >= safetyThreshold) {
            System.out.println("The park is safe.");
        } else {
            System.out.println("The park is unsafe.");
        }
    }
}
