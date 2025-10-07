package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {

        String s1="Hello"; // save in constant pool
        String s4="Hello"; // not save changes
        String s10="Hello"; // not save no changes
        String s11="hello"; //  this will save changes is there // 2 strings save in pool

        //2 Heap OA

        String s2=new String("Hello");
        String s3=new String("Hello");
        String s5=new String("hello"); // saved in 3 times bcoz new string each time will store string

    }
}
