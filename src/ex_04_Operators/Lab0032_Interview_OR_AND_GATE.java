package ex_04_Operators;

public class Lab0032_Interview_OR_AND_GATE {
    public static void main(String[] args) {
        int balaji_salary=12;
        boolean b=!(balaji_salary>10||balaji_salary<5);
        System.out.println(b);
        /* divide and conquer rule
        * balaji_sal>10 --> 12>10 --> true
        * balaji_sal <5 --> 12<5 --> false
        * true || false --> true
        * !(true) --> False // returns false
        * */
    }
}
