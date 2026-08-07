package Chapter08.Exercises;

import java.time.LocalDate;

public class Exercise08 {
}

class Ticket {
    double price;
    String visitorName;
    LocalDate visitDate;

    public Ticket(double price, String visitorName, LocalDate visitDate) {
        this.price = price;
        this.visitorName = visitorName;
        this.visitDate = visitDate;
    }
}
