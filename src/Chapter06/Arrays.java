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

        System.out.println("----------------");

        int[] results3 = {10, 20, 30, 40, 50}; // Double the value of each element
        for (int i = 0; i < results.length; i++) {
            results[i] = results[i] * 2;
        }
        // Print the updated array element
        for (int i = 0; i < results.length; i++){
            System.out.println("Element at " + i + ": " + results[i]);
        }

        System.out.println("----------------");

        int[] results4 = {10, 20, 30, 40, 50};
        for (int x : results) {
            System.out.println("Element: " + x);
        }

        System.out.println("----------------");

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
