package ex_30_Collection_FrameWork.CF_05_Comparable_VS_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Example using comparable (Natural order)
public class Lab_Compare {
    static void main() {
        employee e1 = new employee(3, "pramod");
        employee e2 = new employee(2, "amit");
        employee e3 = new employee(1, "snehal");

        List<employee> employeelist = new ArrayList<>();
        employeelist.add(e1);
        employeelist.add(e2);
        employeelist.add(e3);
        System.out.println(employeelist);
       Collections.sort(employeelist);//unable to sort due to not inform how to sort by using id or name
        System.out.println(employeelist);
    }

}
class employee implements Comparable<employee>{
    int id;
    String name;

    //constructor
    public employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+"-"+name;
    }

    public String printDetails(){
        return id+"-"+name;
    }

    @Override
    public int compareTo(employee o) {
      //  return this.id-o.id;
        return this.name.compareTo(o.name);
    }
}

