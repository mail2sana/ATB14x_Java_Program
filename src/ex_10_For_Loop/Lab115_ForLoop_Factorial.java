package ex_10_For_Loop;

import java.util.Scanner;

public class Lab115_ForLoop_Factorial {
    public static void main(String[] args) {
        // get user input
        Scanner scanner= new Scanner(System.in);
        System.out.println("Plese enter the number");
        int n= scanner.nextInt();
// factorial
        int fact=1;
        if(n==0){
            fact=1;
        }
      //  for (int i = 1; i <=n ; i++) {
         for(int i=n; i>=1;i--){
           fact = fact*i;
        }
        System.out.println(fact);
    }
}
