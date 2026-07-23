package Chapter07.Exercises;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.println(isParkOpen());
    }

    public static String isParkOpen() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();

        if (hour >= 8 && hour <= 19) {
            return "The park is open.";
        } else {
            return "The park is closed.";
        }
    }
}
