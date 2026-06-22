package Chapter07;

public class Calculation {
    public static void main(String[] args) {
        int result = performCalc(10, 2, "+");
        System.out.println(result); // 12
        System.out.println(performCalc(10, 2, "-")); // 8
        System.out.println(performCalc(10, 2, "*")); // 20
        System.out.println(performCalc(10, 2, "/")); // 5
        performCalc(10, 2, "%"); // return value ignored
        System.out.println(performCalc(10, 2, "&")); // Unrecognised operation: &, -1
    }

    public static int performCalc(int x, int y, String operation) {
        int result = switch(operation) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            case "%" -> x % y;
            default -> {
                System.out.println("Unrecognised operation: " + operation);
                yield -1;
            }
        };
        return result;
    }
}
