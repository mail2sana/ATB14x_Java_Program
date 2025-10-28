package Ex_Java_Basic_If_Else.Java_23Oct_Exercise;

import java.util.Scanner;

public class Lab15_Number_Pallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int n1=n;
        int r=0;

        while(n>0){
            r=r*10 + n%10;
            n = n/10;
        }
        if(r==n1){
            System.out.println(r + "->Given number is a pallindrome");
        }
        else {
            System.out.println(r+ "->Given bnumber is not a pallindrom");
        }

    }
}
