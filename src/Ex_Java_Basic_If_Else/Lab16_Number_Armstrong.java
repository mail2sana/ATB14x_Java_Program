package Ex_Java_Basic_If_Else;

import java.util.Scanner;

public class Lab16_Number_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt(); // int num = 153 (1,370,371, 407, 1634 ,8208, 9474)
        int n1=num;
        int numberOfDigits = String.valueOf(num).length();
        int rem;
        int arm=0;
        // 1, 153 , 370,371, 407, 1634 ,8208, 9474

        while(num>0){
            rem = num %10;
          //  arm = arm + (rem*rem*rem);
            arm += (int) Math.pow(rem, numberOfDigits); // arm=arm+Math.pow(rem, numberOfDigits);
            num= num/10;
        }
        if (arm==n1){
            System.out.println( "Given Number is an Armstrong Number.");
        }
        else {
            System.out.println("Given Number is not an Armstrong Number.");
        }
    }
}
