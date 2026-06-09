package Chapter04.Exercises;

import java.util.Scanner;;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your role --> ");
        String role = sc.next();
        int time = 14;
        int safetyRating = 7;

        switch (role) {
            case "Feeding":
                if (time >= 7 && time <= 19){
                    System.out.println("Your job is to feed the dinosaurs.");
                } else {
                    System.out.println("Feeding time is over, assist with cleaning tasks");
                }
                break;
            case "Cleaning":
                System.out.println("Clean the park.");
                break;
            case "Security":
                if (safetyRating < 5) {
                    System.out.println("The safety rating has dropped, increase surveillance.");
                } else {
                    System.out.println("Your job is to monitor the park.");
                }
                break;
            case "Tour guiding":
                if (time >= 8 && time <= 18) {
                    System.out.println("Your job is to guide tourists to the park.");
                } else {
                    System.out.println("Tour guide time is over, assist with other tasks.");
                }
                break;
            default:
                System.out.println("Invalid role.");
                break;
        }
    }
}
