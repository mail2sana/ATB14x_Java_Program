package ex_07_Increment_Decrement_OP;

public class Lab0075_Exp1 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a);
        // a++ -> 10 , a=11
        // ++a -> 12 , a=12
        // 10 + 12 = 22
        System.out.println(a); // 12


    }
}
