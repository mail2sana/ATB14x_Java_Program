package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_RightTriangle_PAttern {
    public static void main(String[] args) {
        /* n=3
        *
        * *
        * * *
         */
        // user input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the n for the pattern Eg. n=3");
        int n=scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
              //  System.out.print("\uD83D\uDE0A");

            }
            System.out.println("");
        }
    }
}
