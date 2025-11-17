package ex_30_Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List_ArrayList {
    static void main() {
    List fruits = List.of("orange", "Apple", "guava","mango");
        System.out.println(fruits);

        List ArrayList = new ArrayList();
        ArrayList.add("pramod");
        ArrayList.add("pramod");
        ArrayList.add(123);
        ArrayList.add(1.25);
        ArrayList.add(true);
        System.out.println(ArrayList);
        System.out.println(ArrayList.size());
}
}