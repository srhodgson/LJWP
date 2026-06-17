package Chapter06.Exercises;

public class Exercise04 {
    public static void main(String[] args){
        String[] name = {"Alex", "John", "Sarah", "Lizz", "James", "Kyle", "Jo", "Clive"};

        System.out.println("Our employees are:");

        for (String employee : name){
            System.out.println(employee);
        }
    }
}
