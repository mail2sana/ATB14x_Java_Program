package ex_11_While_Loop;

import java.util.Scanner;

public class Lab121_WhileLoop_Factorial {
    public static void main(String[] args) {
        /*
        Factorial program
        Logic Building formula
        S1 - figure out what is the data for input and output
        S2-write a rough logic
        S3-write a proper logic
        S4-Optimize
        S5-edge case
         */
        // User iput
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        if(!scanner.hasNextInt()){
            System.out.println("Enter integer only");
        } else {
            int number= scanner.nextInt();
            int fact=1;
            if(number==0){
                fact=1;
                System.out.println("fact=1");
            }
if(number <0 || number > Integer.MAX_VALUE){
    System.out.println("Can't get the factorial its out of bond");
}
int i=1;
while(i<=number){
    fact=fact*i;
    i++;
}
            System.out.println(fact);
        }
    }
}
