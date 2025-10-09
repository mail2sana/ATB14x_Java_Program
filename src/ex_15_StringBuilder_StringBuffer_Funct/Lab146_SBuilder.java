package ex_15_StringBuilder_StringBuffer_Funct;

public class Lab146_SBuilder {
    public static void main(String[] args) {
        // append will take any data type to merge int, long, double, float

        StringBuilder sb=new StringBuilder("Pramod");
        sb.append(123);
        System.out.println(sb);

    }

}
