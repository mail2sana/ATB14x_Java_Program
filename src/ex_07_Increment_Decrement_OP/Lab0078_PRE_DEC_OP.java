package ex_07_Increment_Decrement_OP;

public class Lab0078_PRE_DEC_OP {
    public static void main(String[] args) {
        int a=10;
        int R1=--a;
        int R2=a--;
        System.out.println(R1);
        System.out.println(R2);
        /*R1 : --a -> 9 , a=9
        *R2 : a-- -> 9 , a=8
        * */
        System.out.println(a);
    }
}
