package Chapter09;

// class vehicle extends Object
class Vehicle {
    public void move() {
        System.out.println("Vehicle::move");
    }
}

class Car extends Vehicle{
    @Override public void move() {
        System.out.println("Car::move()");
    }
    public void wheels() {
        System.out.println("Car::wheels()");
    }
}

class Boat extends Vehicle{
    @Override public void move() {
        System.out.println("Boat::move()");
    }
    public void floats() {
        System.out.println("Boat::floats()");
    }
}

class Saloon extends Vehicle{
    @Override public void move() {
        System.out.println("Saloon::move()");
    }
}

class Convertible extends Vehicle{}

public class TestVehicle {
    public static void doAction(Vehicle v) {
        v.move();
    }
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
        Vehicle v = new Car();
        doAction(v);                 // Car::move()
        doAction(new Boat());        // Boat::move()
        doAction(new Saloon());      // Saloon::move()
        doAction(new Convertible()); // Car::move()
    }
}
