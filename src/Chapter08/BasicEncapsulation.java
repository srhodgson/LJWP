package Chapter08;

class Adult {
    private String name;
    private int age;

    Adult(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName(){ return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }


}

public class BasicEncapsulation {
    public static void main(String[] args) {
        Adult john = new Adult("John", 20);
        System.out.println(john.getName() + " " + john.getAge()); // John 20
        // john.age = -99 // 'age' is private
        john.setAge(-99); // Uk-oh
        System.out.println(john.getName() + " " + john.getAge()); // John -99
    }
}
