package Chapter06;

import java.util.Arrays;

public class ArrayHelperMethods {
    public static void main(String[] args) {
        int[] results = {30, 10, 50, 20, 40};

        // Convert the array to a String representation
        String arrayAsString = Arrays.toString(results);
        System.out.println("Array: " + arrayAsString);

        System.out.println("----------");

        int[] results2 = {30, 10, 50, 20, 40};

        // Sort the array
        Arrays.sort(results);
        System.out.println("Sorted array: " + Arrays.toString(results));

        System.out.println("----------");

        int[] results3 = {10, 20, 30, 40, 50};
        int target = 30;
        int index = Arrays.binarySearch(results, target);
        System.out.println("Index of " + target + ": " + index);

        System.out.println("----------");

        int[] results5 = new int[5];
        Arrays.fill(results, 42);
        System.out.println(Arrays.toString(results));

        System.out.println("----------");

        int[] results6 = {10, 20, 30, 40, 50};
        int[] copiedResults = Arrays.copyOf(results6, results6.length);
        System.out.println(Arrays.toString(copiedResults));

        System.out.println("----------");

        int[] originalArray = {10, 20, 30, 40, 50};
        int newLength = 7;
        int[] resizedArray = Arrays.copyOf(originalArray, newLength);
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Resized array: " + Arrays.toString(resizedArray));

        System.out.println("----------");

        int[] results7 = {10, 20, 30, 40, 50};
        int[] results8 = {10, 20, 30, 40, 50};

        boolean arraysEqual = Arrays.equals(results7, results8);
        System.out.println("Are the arrays equal? " + arraysEqual);
    }
}
