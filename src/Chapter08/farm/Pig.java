package Chapter08.farm;

import Chapter08.animals.Dog; // Class is public, OK
// import Chapter08.animals.Animal; // Class is pkg-private, error

public class Pig {
    void testDog() {
        Dog d = new Dog("Shep"); // Constructor is public
        // d.pkgPrivate(); // package-private method, error
    }
}
