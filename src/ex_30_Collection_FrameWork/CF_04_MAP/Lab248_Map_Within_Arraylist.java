package ex_30_Collection_FrameWork.CF_04_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab248_Map_Within_Arraylist {
    static void main() {
        HashMap<String , String> student1 = new HashMap<>();
        student1.put("name", "pramod");
        student1.put("roll no", "1");
        student1.put("phone", "456987321");
        System.out.println(student1);

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("name", "amit");
        student2.put("roll no", "2");
        student2.put("phone", "78964536");
        System.out.println(student2);

        List students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        // List of Map
        // [{phone=456987321, roll no=1, name=pramod}, {phone=78964536, roll no=2, name=amit}]

        //Json
   //     [{phone=456987321, roll no=1, name=pramod}, {phone=78964536, roll no=2, name=amit}]

    }

}


