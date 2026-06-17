package Chapter06.Exercises;

public class Exercise06 {
    public static void main(String[] args) {
        String[][] enclosures = {{"Enclosure 1", "Enclosure 2", "Enclosure 3"}, {"Enclosure 4", "Enclosure 5", "Enclosure 6"}};

        for (int i = 0; i < enclosures.length; i++) {
            for (int j = 0; j < enclosures[i].length; j++) {
                System.out.print(enclosures[i][j] + " ");
            }
            System.out.println();
        }
    }
}
