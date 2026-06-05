package Chapter03;

public class Widening {
    public static void main(String[] args) {
        char c = 'a';  // normal
        int i = c;     // widening, char to int
        float f = i;   // widening int to float
        double d = f;  // widening, float to double
        float f2 = 1L; // widening, long to float
    }
}
