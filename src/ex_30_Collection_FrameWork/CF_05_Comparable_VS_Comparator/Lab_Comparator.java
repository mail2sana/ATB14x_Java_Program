package ex_30_Collection_FrameWork.CF_05_Comparable_VS_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab_Comparator {
    static void main() {
        List<employee2> list = new ArrayList();
        list.add(new employee2(3,"John"));
        list.add(new employee2(1,"Alice"));
        list.add(new employee2(5,"Bob"));

        //comparator for sorting by name
        Comparator<employee2> newcomparator = (e1,e2)->e1.name.compareTo(e2.name);
     //   Comparator<employee2> newcomparator = (e1,e2)->e1.id- e2.id;
        Collections.sort(list,newcomparator);
        System.out.println(list);
    }
}

class employee2{
    int id;
    String name;

//constructor
    public employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id +"-"+name;
    }
}
