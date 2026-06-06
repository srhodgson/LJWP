package Chapter03;

public class Project {
    public static void main(String[] args) {
        int weight = 25000;
        float weightPercentage = 0.25f;
        float dailyFeedWeight = weight * weightPercentage;
        int feedingsPerDay = 3;
        float portionPerFeeding = dailyFeedWeight / feedingsPerDay;

        System.out.println("Our " + weight + "Kg dinosaur needs to eat " + dailyFeedWeight + "Kgs of food a day, which " +
                "is broken down to serve " + portionPerFeeding + "Kgs per feeding.");
    }
}
