package Chapter08.Exercises;

public class Exercise04 {
}

class Park {
    String name;
    Employee[] employees;
    Dinosaur[] dinosaurs;

    public Park(String name, Employee[] employees, Dinosaur[] dinosaurs) {
        this.name = name;
        this.employees = new Employee[50];
        this.dinosaurs = new Dinosaur[20];
    }

    public void addEmployee(Employee employee, int index) {
        if (index > employees.length) {
            System.out.println("The park is at full capacity. No more employees can be added.");
        } else {
            employees[index] = employee;
            System.out.println("Employee added successfully.");
        }
    }

    public void addDinosaur(Dinosaur dinosaur, int index) {
        if (index > dinosaurs.length) {
            System.out.println("The park is at full capacity. No more dinosaurs can be added.");
        } else {
            dinosaurs[index] = dinosaur;
            System.out.println("Dinosaur added successfully.");
        }
    }
}