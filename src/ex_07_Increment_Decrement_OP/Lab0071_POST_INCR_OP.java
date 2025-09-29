package ex_07_Increment_Decrement_OP;

public class Lab0071_POST_INCR_OP {
    public static void main(String[] args) {
        int a=10;
        int b=a++;
        System.out.println(a); //11
        System.out.println(b); //10
       //ERT table
        // L.NO | a | b
        // 5 | 10 | NA
        // 6 | 11 | 10
        // 7 | 11 -> print
        // 8 | 10 -> print
    }
}
