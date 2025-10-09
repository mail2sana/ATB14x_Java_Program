package ex_15_StringBuilder_StringBuffer_Funct;

public class Lab144_StringBuilder_vs_StringBuffer {
    public static void main(String[] args) {
        // 90% we use normal String
        String s0="pramod";
        String s1=new String("pramod");

        //10% we use String builder & buffer
        StringBuilder sb=new StringBuilder("pramod");
        StringBuffer sbf=new StringBuffer("pramod");
    }
}
