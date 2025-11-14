package ex_26_Wrapper_Class;

public class Lab203_Wrapper_Convertion {
    static void main() {
        String num = "10";
        int aa=11;
        // String to Wrapper convert 2 ways parseint , valueof
        Integer a = Integer.parseInt(num);
        //Double.parseDouble()
        // Float. parseFloat()
        //Long.parse

        //String to primitive

        int ap=Integer.parseInt(num);

        // String to Wrapper convert
        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);

        Integer ac = 10;
        String s =ac.toString();
        System.out.println(s);
        System.out.println(s instanceof String);
    }
}
