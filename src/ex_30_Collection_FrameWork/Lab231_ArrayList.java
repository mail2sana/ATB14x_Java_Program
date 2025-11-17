package ex_30_Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab231_ArrayList {
    static void main() {
        List l = new ArrayList<>();
        l.add("bread");
        l.add("milk");
        l.add("paneer");
        l.add("Jam");
        l.add(5689);
        l.add(true);

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains("milk"));

        System.out.println("===========");

        for (Object o : l) {
            System.out.println(o);
        }
        Iterator iterator = l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
