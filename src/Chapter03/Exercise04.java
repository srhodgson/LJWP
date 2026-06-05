package Chapter03;

public class Exercise04 {
    public static void main(String[] args) {
        int maxCapacity = 1500;
        int currentCapacity = 1550;
        boolean isCapacityReached = false;

        if (currentCapacity >= maxCapacity)
            isCapacityReached = true;

        System.out.println("Max capacity reached: " + isCapacityReached);
    }
}
