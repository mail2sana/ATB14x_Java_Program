package Ex_Java_Basic_If_Else;

import java.util.Scanner;

public class Lab17_Eligible_Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        System.out.println("Enter the Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter the credit_score: ");
        int credit_score = sc.nextInt();

        if(age<0 || salary<0 || credit_score<0 ){
            System.out.println("Invalid input! Enter only integer");
        }
        else if (age<18) {
            System.out.println("Not eligible! Minimum age is 18");
        }
        else if (age>80) {
            System.out.println("Not eligible Maximum age is 80");
        }
        else if (salary<30000) {
            System.out.println("Not eligible! minimum salary threshold (30,000)");
        }
        else if (credit_score<=650 && credit_score<=850) {
            System.out.println(" Not eligible! minimum credit score threshold 650 , Max credit score threshold 850");

        }
        else {
            System.out.println("Congratulations you are eligible for a loan");
        }

    }
}
