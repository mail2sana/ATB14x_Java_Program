package ex_15_StringBuilder_StringBuffer_Funct;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");
        sb.append("  programming");
        System.out.println(sb);

        sb.replace(0,4,"C++");
        System.out.println(sb);
    }

}
