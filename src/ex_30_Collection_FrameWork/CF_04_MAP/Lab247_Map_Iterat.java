package ex_30_Collection_FrameWork.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab247_Map_Iterat {
    static void main() {
        Map map = new HashMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 35);
        map.put("id4", null);
        map.put("id5", null);
        map.put("null", 100);

        System.out.println(map);
        System.out.println(map.size());
/*
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + "->" + item.getValue());
        }

 */

    }
}

