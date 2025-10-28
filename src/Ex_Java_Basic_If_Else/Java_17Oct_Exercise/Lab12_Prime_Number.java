package Ex_Java_Basic_If_Else.Java_17Oct_Exercise;

import java.util.Scanner;

public class Lab12_Prime_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();

        boolean isprime=true;

        if (n<=1){
            isprime=false;
        }
        else {
            for (int i = 2; i <=n/2 ; i++) {
                if (n%i==0){
                    isprime=false;
                    break;
                }

            }
        }
        if (isprime){
            System.out.println(n + "->is a prime number");
        }
        else {
            System.out.println(n + " -> is not a prime number");
        }
    }

}
