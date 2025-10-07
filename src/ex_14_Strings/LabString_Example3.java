package ex_14_Strings;

public class LabString_Example3 {
    public static void main(String[] args) {
        String s="Java".substring(2); // J a  v  a
        System.out.println(s); // o/p is va

        String s1="JAVA".substring(1,3); // J A V A
        System.out.println(s1); // o/p is AV

        char[] arr="Java".toCharArray();
        System.out.println(arr); // o/p is ['J','a','v','a']

        String st="   Java   ".trim(); // remove extra spacess
        System.out.println(st);

        boolean b="  ".isBlank();
        System.out.println(b);

        String s2="ab".repeat(3);
        System.out.println(s2);

        boolean b1="Java".equalsIgnoreCase("java");
        System.out.println(b1);

        long count="a\nb\nc".lines().count();
        System.out.println(count);
    }
}
