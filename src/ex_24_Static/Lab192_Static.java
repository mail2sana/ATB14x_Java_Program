package ex_24_Static;

public class Lab192_Static {
    public static void main(String[] args) {
         student s1 = new student(23);
         student s2 = new student(33);

        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(student.course_name);

        System.out.println(s1.course_name);
        System.out.println(s2.course_name);
    }

    }


class student{

    int age ; // non static age is different for all student, instance variable , attribute
   static String course_name = "ATB14x"; // its static name is common for all student
public student(int age_c){
    this.age = age_c;
}
static void m1(){
    System.out.println("I am static method");
}
}

