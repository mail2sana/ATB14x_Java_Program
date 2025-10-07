package ex_14_Strings;

public class Lab141_Interview_P2 {
    public static void main(String[] args) {
        String s1="Hello"; // save in constant pool
        String s4="Hello"; // not save changes

        //2 Heap OA
        String s2=new String("Hello");
        String s3=new String("Hello");
        String s5=new String("hello");

        //comparison -> string -> check this ref location
        System.out.println(s1==s3); // False both store location is different
        System.out.println(s1==s2); // False  both store location is different
        System.out.println(s2==s3); // False its new string

        System.out.println(s1==s4); // True same contant pool string
        System.out.println(s3==s5); // No its new string

        // equals (constant) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

    }
}
