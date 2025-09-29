package ex_07_Increment_Decrement_OP;

public class ab0076_Exp2 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + ++a);
        /* ++a -> 11 , a=11
        *  ++a -> 12 , a=12
        *  11 + 12 = 23 , a=12
        * */
        System.out.println(a);
    }
}
