package ex_30_Collection_FrameWork.CF_01_LIST;

import java.util.ArrayList;
import java.util.*;

public class Lab236_AL_Iteration {
    static void main() {
        // Array list
        List<String> mylist = new ArrayList();
        mylist.add("Raj");
        mylist.add("Prem");
        mylist.add("Jasmine");

        System.out.println(mylist);


// for each  loop print
        System.out.println("Print Array list 1 for each loop");
        for (String str:mylist){
            System.out.println(str);
        }



        // Iterator print
        System.out.println("Print Array list 2 iterator ");
        Iterator<String> iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Print Array list 3 for loop");
        for (int i = 0; i <mylist.size() ; i++) {
            System.out.println(mylist.get(i));
        }


    }
}
