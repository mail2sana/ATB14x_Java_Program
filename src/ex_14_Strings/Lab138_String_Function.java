package ex_14_Strings;

import java.sql.SQLOutput;
import java.util.Locale;

public class Lab138_String_Function {
    public static void main(String[] args) {
        char c='A';
        System.out.println(c); // Char will not store in constant pool its

        // string
        String S1="ABCD"; // store in constant pool
        System.out.println(S1);  // not store in CP
        System.out.println(S1.length());  // not store in CP
        System.out.println(S1.toLowerCase()); // store in CP
        System.out.println(S1.toUpperCase()); // store in CP
        System.out.println(S1.concat("E")); // store in CP

    }
}
