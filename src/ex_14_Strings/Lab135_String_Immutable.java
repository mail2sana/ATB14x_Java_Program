package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        //String immutable
        String name="pramod"; // pramod
        name.toUpperCase();   // PRAMOD
        //which ine will print ? Upper or normal one? Normal why we called normal function name
        //for upper didn't assign call so will not print upper
        System.out.println(name);
        /*
        String name="pramod";
        name=name.toUpperCase();
        System.out.println(name); // for this PRAMOD wiil return
         */


    }

}
