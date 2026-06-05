package Chapter03;

public class Exercise02 {
    public static void main(String[] args) {
        int foodPerKg = 1;
        int weight = 78000;
        int dailyServing = foodPerKg * weight;

        System.out.println("The daily serving is " + foodPerKg + "lb per Kg. A dinosaur weighing " + weight + "Kgs would need " +
                dailyServing + "lbs of food a day.");
    }
}
