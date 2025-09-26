package ex_06_TernaryOperator;

public class Lab0064_TO_Nested {
    public static void main(String[] args) {

        int age=21;
        //int age=11;
        //int age=30;

       // String Raj=age>18? "Yes" : "No"; -->Normal
        // multiple conditions checking is called Nested Ternary

        String Raj=age>18 ? (age>25 ? "Raj can drink": "can't drink"): "No";

        System.out.println(Raj);
    }
}
