package ex_30_Collection_FrameWork.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_Map {
    static void main() {
        // Map -> 4
        /* 1. Hashmap
        2. Linked Hashmap
        3. HashTable
         */
     //   Map m1 =new Map();
        /*
        Map m1 = new HashMap();
        m1.put("name" , "pramod");
        m1.put("rollNo", "123");
        m1.put(true , "pramod");
        m1.put(3.14 , "pramod");

         */

        Map m1 = new HashMap();
        /*
        Map is a key value
        name : pramod
        Roll no : 1
        phone : 7894563215
        allows one null key , one null value
         */

        m1.put("name", "Pramod");
        m1.put("rollNo" , 1);
        m1.put("phone no",789456325);
        System.out.println(m1);
        //keys are randomly added

        Map m2 = new LinkedHashMap();
        m2.put("name", "Pramod");
        m2.put("rollNo" , 1);
        m2.put("phone no",789456325);
        System.out.println(m2);
// keys are in proper order what we added

        Map m3 = new TreeMap();
        m3.put("name", "Pramod");
        m3.put("rollNo" , 1);
        m3.put("phone no",789456325);
        System.out.println(m3);
// keys are in sorting order
    }
}
