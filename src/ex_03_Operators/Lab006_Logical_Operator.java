package ex_03_Operators;

public class Lab006_Logical_Operator {
    public static void main(String[] args) {
        /*Logical Operator :
        * AND&&,
        * OR||,
        * !NOT(REVERSE)
        * */
        boolean a=true;
        System.out.println(!a);

        boolean b=true;
        System.out.println(!!b);

        boolean c=true||false;
        System.out.println(c);

        boolean c1=false && true; // gate system
        System.out.println(c1);
    }
}
