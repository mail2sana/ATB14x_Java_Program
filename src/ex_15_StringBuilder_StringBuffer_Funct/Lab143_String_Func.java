package ex_15_StringBuilder_StringBuffer_Funct;

public class Lab143_String_Func {
    public static void main(String[] args) {
        String name="Sonal";

        //1. Length
        System.out.println(name.length());

        //2. Char at
        System.out.println(name.charAt(3));

        //3.Concat
        System.out.println(name.concat("patel"));

        // 4. contains
        System.out.println(name.contains("on"));

        //5.Equals
        System.out.println(name.equals("Sonal"));

        //6. Equal ingnore case
        System.out.println(name.equalsIgnoreCase("sonal"));

        //7. index of sonal -> place of o
        System.out.println(name.indexOf('o'));

        //first occurance of the specified substring
        String s1="madam";
        System.out.println(s1.indexOf("m"));

        //8.replace
        System.out.println(name.replace('l', 'm'));

        //substring
        System.out.println(name.substring(1,3));

        //9. to lower case
        System.out.println("SONAL".toLowerCase());

        //10. to upper case
        System.out.println("sonal".toUpperCase());

        //11. starts with
        System.out.println(name.startsWith("S"));

        // 12.ends with
        System.out.println(name.endsWith("a"));

        // 13.trim
        String name1="    Harish    ";
        System.out.println(name1.trim());

        //14. compare to
        System.out.println(name.compareTo("Sonal"));

//----------------------x----------
StringBuilder sb=new StringBuilder("sonal");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("Hi");
        System.out.println(sb1.toString());
    }
}
