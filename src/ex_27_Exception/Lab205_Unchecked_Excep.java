package ex_27_Exception;

public class Lab205_Unchecked_Excep {
    public static void main(String[] args){
        int a= 0;
        int b=10;
        int c= b/a; // Runtime unchecked -Arithmetic exception
        System.out.println(c);

        String name = null;
        name.trim(); // Runtime unchecked - NullPointer Exception
    }
}
