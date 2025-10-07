package ex_14_Strings;

public class LabString_Example4 {
    public static void main(String[] args) {
        String s="java";
        char c=s.charAt(2);
        System.out.println(c);

       // int result="abc".compareTo("ABC"); // not equal so ASCII no is showing 32
        int result="abc".compareTo("abc");
        System.out.println(result);
// index
        int idx="Java".indexOf("a");
        System.out.println(idx);

        int idx1="java".lastIndexOf("a");
        System.out.println(idx1);
        // joim
        String st1=String.join("-", "Java", "python");
        System.out.println(st1);
        // replace
        String s11="Java".replace("a", "o"); // Jovo
        System.out.println(s11);
        // starts with
        boolean b="Java".startsWith("Ja"); // true
        System.out.println(b);

    }
}
