package ex_30_Collection_FrameWork;

import java.util.Vector;

public class Lab230_Vector {
    static void main() {
        Vector v = new Vector(); // same like Array
        v.add("pramod");
        v.add(123);
        v.add(12.65);
        System.out.println(v);
        System.out.println(v.contains("Lucky"));

    }
}
