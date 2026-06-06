package Chapter03;

public class Exercise05 {
    public static void main(String[] args) {
        int age1 = 23;
        int age2 = 49;
        int difference;

        if (age1 > age2) {
            difference = age1 - age2;
        } else if (age2 > age1) {
            difference = age2 - age1;
        } else if (age1 == age2) {
            difference = 0;
        } else {
            difference = -1;
        }

        System.out.println("The age difference between the two dinosaurs is " + difference);
    }
}
