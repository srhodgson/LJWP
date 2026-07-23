package Chapter07.Exercises;

public class Exercise03 {
    public static void main(String[] args) {
        int[] ages = { 35, 12, 56, 2, 37, 30 };

        System.out.println("Average age: " + avgAge(ages));
    }

    public static int avgAge(int[] ages){
        int totalAge = 0;
        for (int age : ages) {
            totalAge = totalAge + age;
        }
        return totalAge / ages.length;
    }
}
