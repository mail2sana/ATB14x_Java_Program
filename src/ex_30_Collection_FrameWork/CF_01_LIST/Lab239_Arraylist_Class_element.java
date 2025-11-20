package ex_30_Collection_FrameWork.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab239_Arraylist_Class_element {
    static void main() {
        Student s1 = new Student("Amit", "1");
        Student s2 = new Student("Ritwick", "2");
        Student s3 = new Student("Shubam", "3");

        List<Student> myStudent = new ArrayList();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

            }
}
class Student extends Object{

    private String name;
    private String rolln;

    public Student(String name, String rolln) {
        this.name = name;
        this.rolln = rolln;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRolln() {
        return rolln;
    }

    public void setRolln(String rolln) {
        this.rolln = rolln;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" +name + '\'' +
                ",rolln='"+ rolln + '\'' +
                '}';
    }
}
