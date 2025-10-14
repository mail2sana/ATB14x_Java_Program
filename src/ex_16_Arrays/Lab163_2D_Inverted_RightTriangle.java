package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Inverted_RightTriangle {
    public static void main(String[] args) {
        /* n=3
         * * *
         * *
         *
         */
          /*    00 01 02
                10 11 12
                20 21 22
                 */
        // user input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the n for the pattern Eg. n=3");
        int n=scanner.nextInt();

        for (int i =n; i>=1; i--) {
            for (int j =1; j<=i; j++) {
                 System.out.print("*");
               // System.out.print("\uD83D\uDE0A");


            }
            System.out.println("");
        }

    }
}
