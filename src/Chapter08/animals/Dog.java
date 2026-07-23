package Chapter08.animals;

public class Dog {
    private String dogName;
    protected int age;
    public Dog(String dogName) {
        this.dogName = dogName;
    }
    public String getDogName() {
        return dogName;
    }
    void pkgPrivate(){}
}

class Cat {
    Cat() {}
    public void testDogAccess() {
        Dog d = new Dog("Rex");
        // d.dogName = "ABC"; // dogName is private to Dog
        d.age = 2;
        d.pkgPrivate(); // ok
    }
}
