package ex_26_Wrapper_Class;

public class Lab204_AutoBoxing_Wrapper {
    static void main() {
        int a=10;
        Integer b=a;
        // Boxing - Primitive to wrapper -> Autoboxing Javm will do automatic
        System.out.println(b.intValue());
        System.out.println(a);

        //Unboxing - Wrapper to primitive ->
        Integer aa=43;
        int ab=aa;
        System.out.println(ab);
    }
}
