package ex_30_Collection_FrameWork.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;

public class Lab_Interview {
    static void main() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("reverse ->" + al);

        for (Integer o:al){
            System.out.println(6*o);
        }
    }
}
