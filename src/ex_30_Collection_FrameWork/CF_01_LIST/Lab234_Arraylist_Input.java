package ex_30_Collection_FrameWork.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab234_Arraylist_Input {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String ContinueInput = "Y";

        List<String> names=new ArrayList<>();

        while(ContinueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name");
            String name = sc.next();
            names.add(name);
            sc.nextLine();

            System.out.println("Do you want to enter the another name");
            ContinueInput =sc.nextLine();
        }
        for (String name:names){
            System.out.println(name);
        }
        sc.close();
    }
}
