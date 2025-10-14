package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Left_Triangle {
    public static void main(String[] args) {
        /* n=3
         *   i=1 space=2 , n=3 , space=n-i , star =1
       * *   i=2 space=1 , n=3   space=n-i , star=2
     * * *   i=3 space=0 , n=3   space=n-i , star=3
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the n patern");
        int n= scanner.nextInt();

        for (int i = 0; i <n ; i++) {
            // print space
            for (int j=i; j< n-1 ; j++) {
                System.out.print("-");
            }
            // print stars
            for (int k= 0; k<=i; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
