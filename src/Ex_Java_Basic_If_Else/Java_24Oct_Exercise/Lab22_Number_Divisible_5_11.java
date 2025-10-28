package Ex_Java_Basic_If_Else.Java_24Oct_Exercise;

import java.util.Scanner;

public class Lab22_Number_Divisible_5_11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 5 ==0 && num % 11 ==0){
            System.out.println("The number is divisible by 5 and 11");
        }
        else {
            System.out.println("The number is not divisble by 5 and 11");
        }
    }
}
