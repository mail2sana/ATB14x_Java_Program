package ex_24_Static;

public class Lab193_Static_P2 {
}
class ATB14x{
    int phone_no;
    String name;

    static String course_name = "ATB14X";

    static void mark_Attendance(){
        System.out.println("Mark Attendance");
     //   System.out.println(this.phone_no); static method cannot access the non static variable
    }
    void display(){
        // Non static method can access the static variable
        System.out.println(this.phone_no + this.name + course_name);
    }
}
