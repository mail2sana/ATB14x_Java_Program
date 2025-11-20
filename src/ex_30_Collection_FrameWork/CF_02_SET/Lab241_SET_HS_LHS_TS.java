package ex_30_Collection_FrameWork.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_SET_HS_LHS_TS {
    public static void main(String[] args) {
    Set<String> hs = new HashSet<>();
    // hashing mechanism to store the element , no order
    // no duplicates
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Orange");
        hs.add("Orange");
      //  hs.add(123);
        hs.add(null);
        System.out.println(hs);
        System.out.println("-----------------");

        Set lhs = new LinkedHashSet();
        //Linkedlist  mechanism to store the element
        // order will maintain , no duplicates
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("-----------------");

        Set ts = new TreeSet();
        //Black and Red tree mechanism to store the element
        // order will maintain , natural sorting is done
        // sorting and removing the duplicate

        // hs -> No order will be maintained
        // lhs -> Order will be maintainted
        // ts -> Natural order will be maintained


        ts.add("Dpple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Watermellon");
        ts.add("Watermellon");
     //   ts.add(null); // Null pointer exception
      //  ts.add(123); // Class cast exception
        System.out.println(ts);



    }
}
