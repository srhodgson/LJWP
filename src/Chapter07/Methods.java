package Chapter07;

public class Methods {
    public static void main(String[] args) {
        System.out.println("main: before call to simpleExample()");
        simpleExample();
        System.out.println("main: after call to simpleExample()");
    }

    public static void simpleExample() {
        System.out.println("\tExecuting simpleMethod() method...");
    }
}
