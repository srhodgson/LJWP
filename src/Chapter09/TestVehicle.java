package Chapter09;

// class vehicle extends Object
class Vehicle {
    double cost = 100.0;    // instance data
    static int age =1;      // class data

    public void move() {    // instance method
        System.out.println("Vehicle::move");
    }

    public static void sm() {   // class method
        System.out.println("Vehicle::sm()");
    }
}

class Car extends Vehicle{
    double cost = 20_000.0; // hiding
    static int age = 2;     // hiding

    @Override public void move() {  // overriding
        System.out.println("Car::move()");
    }

    public static void sm() {
        System.out.println("Car::sm()");
    }
}

//class Boat extends Vehicle{
//    @Override public void move() {
//        System.out.println("Boat::move()");
//    }
//    public void floats() {
//        System.out.println("Boat::floats()");
//    }
//}

//class Saloon extends Vehicle{
//    @Override public void move() {
//        System.out.println("Saloon::move()");
//    }
//}

//class Convertible extends Vehicle{}

public class TestVehicle {
//    public static void doAction(Vehicle v) {
//        v.move();
//    }

    public static void main(String[] args) {
//      Vehicle v = new Car();
//      v.move();      // Car::move
//      v = new Boat();
//      v.move();      // Boat::move()
//      // v.floats(); // compiler error
//      v = new Saloon();
//      v.move();      // Saloon::move()
//      v = new Convertible();
//      v.move();      // Car::move()
//
//      Saloon s = (Saloon)new Vehicle(); // ClassCastException
//        Vehicle v = new Car();
//        doAction(v);                 // Car::move()
//        doAction(new Boat());        // Boat::move()
//        doAction(new Saloon());      // Saloon::move()
//        doAction(new Convertible()); // Car::move()

        Vehicle v = new Car();
        System.out.println(v.cost); // 100.0
        System.out.println(v.age);  // 1
        v.sm();                     // Vehicle::sm()
        v.move();                   // Car::move();
    }
}
