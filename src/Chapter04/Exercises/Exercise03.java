package Chapter04.Exercises;

public class Exercise03 {
    public static void main(String[] args) {
        int yrsExpRequired = 10;
        String dinoBreed = "T-Rex";

        if (dinoBreed == "T-Rex" && yrsExpRequired < 5) {
            System.out.println("Sorry, you don't have enough experience to train a " + dinoBreed + ".");
        } else {
            System.out.println("You can train a " + dinoBreed + "!");
        }
    }
}
