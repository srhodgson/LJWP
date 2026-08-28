package Chapter09;

// class vehicle extends Object
class Vehicle {
    public String toString() {
        return "Vehicle::toString";
    }
}

class Car extends Vehicle{}
class Boat extends Vehicle{}
class Saloon extends Vehicle{}
class Convertible extends Vehicle{}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.toString()); // Vehicle::toString()

        Car car = new Car();
        System.out.println(car);                // Vehicle::toString()

        Saloon saloon = new Saloon();
        System.out.println(saloon);             // Vehicle::toString()

        System.out.println(new TestVehicle().toString());  // Chapter09.TestVehicle@a09ee92
    }
}
