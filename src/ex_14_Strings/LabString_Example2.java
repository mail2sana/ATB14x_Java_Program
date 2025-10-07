package ex_14_Strings;

public class LabString_Example2 {
    public static void main(String[] args) {
        CharSequence s="pramod".subSequence(1,4); // end indexx allways n-1-> 4-1=3
        System.out.println(s); // index starts with 0 -> 1 to 3 will print
    }
}
