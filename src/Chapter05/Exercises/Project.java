package Chapter05.Exercises;

public class Project {
    public static void main(String[] args) {
        int trexMorning = 8;
        int trexAfternoon = 14;
        int trexEvening = 20;
        int brachiosaurusMorning = 10;
        int brachiosaurusAfternoon = 15;
        int brachiosaurusEvening = 22;

        for (int currentTime = 0; currentTime <= 23; currentTime++) {
            if (currentTime == trexMorning || currentTime == trexAfternoon || currentTime == trexEvening ) {
                System.out.println("It's " + currentTime + ":00 - Feeding time for T-Rex with 100Kg of food. ");
            } else if (currentTime == brachiosaurusMorning || currentTime == brachiosaurusAfternoon || currentTime == brachiosaurusEvening) {
                System.out.println("It's " + currentTime + ":00 - Feeding time for Brachiosaurus with 200Kg of food. ");

            } else {
                System.out.println("It's " + currentTime + ":00 - No dinosaurs are being fed.");
            }
        }


    }
}
