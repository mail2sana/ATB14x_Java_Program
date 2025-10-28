package Ex_Java_Basic_If_Else;

import java.util.Scanner;

public class Lab15_Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numer to check pallindrome or not");
        int number = scanner.nextInt();
        int reverse=0;

        while(number>0){
            reverse=reverse*10+number%10;
            number = number / 10;
                    }
        System.out.println(reverse);

        }
    }

