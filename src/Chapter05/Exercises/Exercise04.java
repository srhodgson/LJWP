package Chapter05.Exercises;

public class Exercise04 {
    public static void main(String[] args) {
        int[] wheights = {25000, 75000, 100000};
        int totalWeight = 0;

        for (int weight : wheights) {
            totalWeight += weight;
        }

        System.out.println("The total weight of the dinosaurs is " + totalWeight + "Kgs.");
    }
}
