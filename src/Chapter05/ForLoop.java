package Chapter05;

public class ForLoop {
    public static void main(String[] args) {
        // for(init; booleanExpre; incr/decr)
        for (int i=1; i<= 3; i++) {
            System.out.println(i);
        }

        System.out.println("----------------");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Looping");
        }

        System.out.println("----------------");

        for (int i = 10; i <= 50; i+= 10) {
            System.out.println(i);
        }

        System.out.println("----------------");

        for (int i = 0, j = 0; i < 1 && j < 1; i++, j++) {
            System.out.println(i + " " + j);
        }

        System.out.println("----------------");

        int[] ia = {1,2,3};
        for (int i = 0; i < ia.length; i++) {
            System.out.println(ia[i]); // 1, 2, 3
        }

        System.out.println("----------------");

        int[] ib = {1, 2, 3};
        // for(dataType variableName:array or collection)
        for (int n:ib) {
            System.out.println(n);
        }
    }
}
