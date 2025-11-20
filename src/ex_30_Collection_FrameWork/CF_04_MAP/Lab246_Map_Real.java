package ex_30_Collection_FrameWork.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Lab246_Map_Real {
    static void main() {
        Map<String, Object> student1 = new HashMap();
        student1.put("name", "Pramod");
        student1.put("phone" ,"456987325");
        student1.put("address", "458 strt BLR");
        student1.put("Home addr", "BTM");
        System.out.println(student1);


        Map<String, Object> student2 = new LinkedHashMap<>();
        student2.put("name", "Pramod");
        student2.put("phone" ,"456987325");
        student2.put("address", "458 strt BLR");
        student2.put("Home addr", "BTM");
        System.out.println(student2);
    }
}
