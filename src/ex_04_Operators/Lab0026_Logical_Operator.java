package ex_04_Operators;

public class Lab0026_Logical_Operator {
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

        boolean c=true||false;   // or gate one true also true
        System.out.println(c);

        boolean c1=false && true; // and gate one false also false
        System.out.println(c1);
    }
}
