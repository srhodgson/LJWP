package Chapter03;

public class PrefixPostfix {
    public static void main(String[] args) {
        int x = 3;
        ++x;

        System.out.println(x);   // 4
        System.out.println(x++); // 4
        System.out.println(x);   // 5

        int y = 4;
        y--;

        System.out.println(y);   // 3
        System.out.println(--y); // 2
        System.out.println(y);   // 2
    }
}
