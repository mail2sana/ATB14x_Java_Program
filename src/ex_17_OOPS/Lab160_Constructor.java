package ex_17_OOPS;

public class Lab160_Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        // new Student() - this is object
        // Student() - this is constructor
        Student s2 = new Student("pramod");
    }
}
class Student{ // this is not accessible by other classes
    String name;

    // Default Constructor DC created by JVM automatically
    Student(){  // it is empty right now doesn't have any values
        System.out.println("DC-> Hi, I'm called");
    }
    // Parameterized Constructor
    Student(String name){  // it is empty right now doesn't have any values
        System.out.println("PC-> Hi," + name);
    }


    void sleep(){}
    void study(){}
    void eat(){}

}