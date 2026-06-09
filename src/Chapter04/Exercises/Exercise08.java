package Chapter04.Exercises;

import java.time.*;

public class Exercise08 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime openTime = LocalTime.parse("08:00");
        LocalTime closeTime = LocalTime.parse("19:00");

        if (time.compareTo(openTime) >= 0 && time.compareTo(closeTime) <= 0) {
            System.out.println("The park is open.");
        } else {
            System.out.println("The park is closed.");
        }
    }
}
