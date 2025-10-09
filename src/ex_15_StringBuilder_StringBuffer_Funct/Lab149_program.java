package ex_15_StringBuilder_StringBuffer_Funct;

import java.util.Scanner;

public class Lab149_program {
    public static void main(String[] args) {
        // write a program to reverse a string using inbuilt function
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input i will reverse it");
        String User_Input=scanner.next();

    /*    StringBuilder stringBuilder=new StringBuilder(User_IP);
        System.out.println(stringBuilder.reverse());

     */

        // write a program to reverse a string without using inbuilt function
String Reverse_UserInput=" ";
char[] arr=User_Input.toCharArray();

      //  for (int i =User_Input.length()-1 ;i>=0 ; i--) {
        //    Reverse_UserInput = Reverse_UserInput+User_Input.charAt(i);

        for (int i = arr.length-1; i >=0 ; i--) {
            Reverse_UserInput = Reverse_UserInput+arr[i];
        }
        System.out.println(Reverse_UserInput);

    }
}
