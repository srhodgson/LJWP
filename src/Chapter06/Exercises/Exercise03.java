package Chapter06.Exercises;

public class Exercise03 {
    public static void main(String[] args) {
        int[] dinoSizes = {1500, 2000, 5000, 200, 1234, 8898, 123421};
        int minDinoSaize= dinoSizes[0];

        for (int i = 1; i < dinoSizes.length; i++) {
            if (dinoSizes[i] < minDinoSaize) {
                minDinoSaize = dinoSizes[i];
            }
        }

        System.out.println("The smallest dinosaur is " + minDinoSaize + "cm.");
    }
}
