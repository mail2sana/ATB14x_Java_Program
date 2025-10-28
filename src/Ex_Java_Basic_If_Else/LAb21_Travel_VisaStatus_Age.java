package Ex_Java_Basic_If_Else;

import java.util.Scanner;

public class LAb21_Travel_VisaStatus_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        boolean visa =true;

        if ((age >=18 && visa) == true) {
            System.out.println("eligible to travel");
        }
        else {
            System.out.println(" Not eligible to travel");
        }
    }
}
