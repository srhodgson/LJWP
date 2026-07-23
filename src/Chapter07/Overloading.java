package Chapter07;

public class Overloading {
    public static void main(String[] args) {
        int sum = add(3, 4);
        System.out.println(sum); // 7
        double addition = add(3.0, 4.0);
        System.out.println(addition); // 7.0
    }

    public static int add(int x, int y) {
        System.out.println("add(int,int)");
        return x + y;
    }

    public static double add(double x, double y) {
        System.out.println("add(double,double)");
        return x + y;
    }
}
