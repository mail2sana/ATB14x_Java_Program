package ex_27_Exception;

import java.util.Scanner;

public class Lab_Throw {
    static void main() {
        Scanner sc = new Scanner(System.in);
        if(!sc.next().equalsIgnoreCase("pramod")){
           // throw new CustomException("Not allowed");
            throw new ArithmeticException("He he we");

        }
    }

}
