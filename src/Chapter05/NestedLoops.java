package Chapter05;

public class NestedLoops {
    public static void main(String[] args) {
        int[] data = {9, 3, 5, 7};

        System.out.println("[]\t[n]\tHistogram");
        for (int i = 0; i < data.length; i++) {
            System.out.print(i + "\t" + data[i] + "\t");
            for (int j = 1; j <= data[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------");

        System.out.println("i, j");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break;
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}
