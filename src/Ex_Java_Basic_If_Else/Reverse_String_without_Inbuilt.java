package Ex_Java_Basic_If_Else;

public class Reverse_String_without_Inbuilt {
    public static void main(String[] args) {

        String s1="Sangeetha";
        String R1="";

        for (int i = s1.length()-1; i >=0 ; i--) {
           R1=R1+s1.charAt(i);
        }
        System.out.println(R1);
    }
}
