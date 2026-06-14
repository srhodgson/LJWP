package Chapter06;

public class Arrays {
    public static void main(String[] args) {
        String[] names = {"Maria", "Fatiha", "Pradeepa", "Sarah"};
        int index = 5;
        if (index >= 0 && index < names.length) {
            System.out.println("Element at index " + index + ": " + names[index]);
        } else {
            System.out.println("Invalid index: " + index);
        }

        System.out.println("----------------");

        int[] results = {10, 20, 30, 40, 50};
        for (int i = 0; i < results.length; i++) {
            System.out.println("Element at " + i + ": " + results[i]);
        }

        double[] results2 = {7.0, 8.6, 9.0};
        double total = 0;
    }
}
