package Chapter06.Exercises;

public class Exercise07 {
    public static void main(String[] args) {
        String[][] busSeats = {
                {"Seat A", "Seat B", "Seat C"},
                {"Seat D", "Seat E", "Seat F"},
                {"Seat G", "Seat H", "Seat I"},
                {"Seat J", "Seat K", "Seat 11"}
        };

        for (int i = 0; i < busSeats.length; i++) {
            for (int j = 0; j < busSeats[i].length; j++) {
                System.out.print(busSeats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
