package ex_30_Collection_FrameWork.CF_01_LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab235_AL_LL {
    static void main() {
        List mylist0 = new ArrayList<>();
        List mylist1 = new ArrayList<>(10);
        List mylist2 = List.of("12", "55.6");

        List mylist = new LinkedList();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4);
        System.out.println(mylist);




    }
}
