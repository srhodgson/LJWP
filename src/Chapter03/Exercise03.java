package Chapter03;

public class Exercise03 {
    public static void main(String[] args) {
        int year = 2026;
        boolean isLeapYear = false;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            isLeapYear = true;

        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
