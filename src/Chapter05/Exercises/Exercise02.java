package Chapter05.Exercises;

public class Exercise02 {
    public static void main(String[] args) {
        int hunger = 100;

        do {
            System.out.println("Feeding the hungry dinosaur...");
            hunger = hunger -1;
        } while (hunger > 0);
    }
}
