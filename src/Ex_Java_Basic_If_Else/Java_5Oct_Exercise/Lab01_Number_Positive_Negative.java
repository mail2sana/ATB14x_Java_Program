package Ex_Java_Basic_If_Else.Java_5Oct_Exercise;

import java.util.Scanner;

public class Lab01_Number_Positive_Negative {
    public static void main(String[] args) {
       //Check if a Number is Positive or Negative.
        // get userinput

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num= scanner.nextInt();
        // int num=10

        if(num>0){
            System.out.println("Its positive");

        } else {
            System.out.println("Its Negative");
        }
    }
}
