package ex_30_Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab233_ArrayList_Marks {
    static void main() {
        List marks = new ArrayList<>();
        marks.add(93);
        marks.add(56);
        marks.add(87);
        marks.add(91);
        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);



    }
}
