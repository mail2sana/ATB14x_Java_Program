package ex_26_Wrapper_Class;

public class Lab202_Wrapper_DataConvert {
    static void main() {
        int a = 10; // primitive data type
     //   a. primitive data have no attribute
      //  a.length(); primitive data have no method (no behavior)

        Integer a1=11;
        // wrapper class have attribute , method straight can use
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.valueOf(a1));
        System.out.println(a1.intValue());

    }
}

