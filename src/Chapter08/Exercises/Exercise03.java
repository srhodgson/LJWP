package Chapter08.Exercises;

public class Exercise03 {
    public static void main(String[] args) {
        Dinosaur dino1 = new Dinosaur("T-Rex", 23, "T-Rex enclosure");
        Dinosaur dino2 = new Dinosaur("Velociraptor", 12, "Velociraptor enclosure");
        printDinoInfo(dino1);
        printDinoInfo(dino2);

        Employee emp1 = new Employee("John", 35, "Shop assistant");
        Employee emp2 = new Employee("Jane", 28, "Ranger");
        printEmpInfo(emp1);
        printEmpInfo(emp2);
    }

    public static void printDinoInfo(Dinosaur dino) {
        System.out.println("Name: " + dino.name);
        System.out.println("Age: " + dino.age);
        System.out.println("Species: " + dino.species);
    }

    public static void printEmpInfo(Employee emp) {
        System.out.println("Name: " + emp.name);
        System.out.println("Years of experience: " + emp.yearsOfExperience);
        System.out.println("Job title: " + emp.jobTitle);
    }
}
