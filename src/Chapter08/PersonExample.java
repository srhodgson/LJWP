//package Chapter08;
//
//class Person {
//    private String name; // instance variable
//    private static int count;   // instance variables
//
//    Person(String aName) { // constructor
//        name = aName;
//        count++;
//    }
//
//    public String getName() { // instance method
//        return name;
//    }
//
//    public void setName(String aName) { // instance method
//        name = aName;
//    }
//
//    public static int getCount() { // instance method
//        return count;
//    }
//}
//
//public class PersonExample {
//    public static void main(String[] args) {
//        Person p1 = new Person("Maaike");
//        Person p2 = new Person("Sean");
//
//        System.out.println(p1.getName()); // Maaike
//        System.out.println(p2.getName()); // Sean
//
//        p1.setName("Maaike van Putten");
//        p2.setName("Sean Kennedy");
//
//        System.out.println(p1.getName()); // Maaike van Putten
//        System.out.println(p2.getName()); // Sean Kennedy
//
//        System.out.println(Person.getCount()); // 2
//    }
//}