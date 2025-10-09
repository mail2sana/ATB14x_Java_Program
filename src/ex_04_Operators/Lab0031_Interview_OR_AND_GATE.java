package ex_04_Operators;

public class Lab0031_Interview_OR_AND_GATE {
    public static void main(String[] args) {
        // AND gate
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); //true
        System.out.println(false || false); // false
        // OR GATE
        System.out.println(true && true); // true
        System.out.println(true && false); //false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
    }
}
