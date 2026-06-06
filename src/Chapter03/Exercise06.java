package Chapter03;

public class Exercise06 {
    public static void main(String[] args) {
        int safetyRating = 7;
        int safetyThreshold = 6;
        boolean isSafe = false;

        if (safetyRating >= safetyThreshold)
            isSafe = true;

        System.out.println("Is the park safe? " + isSafe);
    }
}
