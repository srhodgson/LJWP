package Chapter07.Exercises;

public class Exercise06 {
    public static void main(String[] args) {
        int currentGuests = 45;
        int maxGuests = 250;

        System.out.println("Is the park currently full? " + parkFull(currentGuests, maxGuests));
    }

    public static Boolean parkFull(int currentGuests, int maxGuests) {
        return currentGuests >= maxGuests;
    }
}
