package ex_27_Exception;

public class Lab208_Arithmetic {
    public static void main(String[] args){
        int c =0;
        int b =0;
         // Run time unchecked - Arithmetic exception
     //   System.out.println(b);
        try {
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println("Not Allowed");
        }
        catch (Exception e){
            System.out.println("Not allow");
            // multiple catch is allowed
        }
        catch (Throwable e){
            System.out.println("Hello");
        }
    }
}

