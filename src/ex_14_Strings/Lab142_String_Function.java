package ex_14_Strings;

public class Lab142_String_Function {
    public static void main(String[] args) {
        // String s1="Hello"; // SCP
        // String s2=new string("world"); // OA
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");

        System.out.println(str1==str2);
        System.out.println(str1==str3);  //different location
        System.out.println(str1.equals(str3)); // checking value so true

        System.out.println(str1.concat(str3));
    }
}
