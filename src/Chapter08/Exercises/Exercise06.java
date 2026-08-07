package Chapter08.Exercises;

public class Exercise06 {
}

class Enclosure {
    String name;
    Dinosaur[] dinosaurs;

    public Enclosure(String name) {
        this.name = name;
        this.dinosaurs = new Dinosaur[5];  // assuming a max capacity of 5 dinosaurs per enclosure
    }
}
