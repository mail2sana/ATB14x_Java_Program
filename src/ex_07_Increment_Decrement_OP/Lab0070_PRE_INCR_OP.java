package ex_07_Increment_Decrement_OP;

public class Lab0070_PRE_INCR_OP {
    public static void main(String[] args) {
        int a=10;
      //  System.out.println(++a);
        int b= ++a;
       // ++a --> a=a+1
       // ERT Table
        // LineNo | a | Result b
        // 5 | 10 | NA
        // 6 | 11 | 11
        //14 | 11 -> print
        // 15 | 11 -> print
        System.out.println(a);
       System.out.println(b);
    }


}
