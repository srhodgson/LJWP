package Chapter05.Exercises;

public class Exercise05 {
    public static void main(String[] args) {
        int ticketsRemaining = 250;

        while (ticketsRemaining > 0) {
            System.out.println("Ticket remaining: " + ticketsRemaining);
            System.out.println("Selling ticket...");
            ticketsRemaining--;
        }
    }
}
