package ex_30_Collection_FrameWork.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab232_Nested_Arraylist {
    static void main() {
        List<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("cherry");
        //   fruits.add(123);

        System.out.println(fruits);
        System.out.println("------------");

        List fruits1 = new ArrayList<>();
        fruits1.add("banna");
        fruits1.add("mango");
        System.out.println(fruits1);
        System.out.println("--------------");

        List veg = new ArrayList<>();
        veg.add("carrot");
        veg.add("beetroot");
        veg.add("onnion");
        System.out.println(veg);
        System.out.println("-------------");

        List all_item = new ArrayList<>();
        all_item.add(fruits);
        all_item.add(fruits1);
        all_item.add(veg);

        System.out.println(all_item);
        System.out.println(all_item.size());
        System.out.println(all_item.get(1));
    }
}
