package Ex_Java_Basic_If_Else.Java_17Oct_Exercise;

import java.util.Scanner;

public class Lab13_ATM_Withdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int n = scanner.nextInt();
        
        int balance = 10000;

        if (n<=0){
            System.out.println("Invalid amount Entered");
        }
        else if (n<=balance) {
            System.out.println("Withdraw Successful");
            balance -= n;
            System.out.println("Ubdate balenace Rs." + balance);
        }
        else {
            System.out.println("Unable to withdraw insufficient balance");
        }
    }
}
