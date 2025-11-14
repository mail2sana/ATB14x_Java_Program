package ex_27_Exception;

import java.util.Scanner;

public class Lab213_Purpose_Finally {
    static void main() {
        Scanner sc = new Scanner(System.in);
        try{
            int v =sc.nextInt();
            int a= 10/v;
                    }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}

