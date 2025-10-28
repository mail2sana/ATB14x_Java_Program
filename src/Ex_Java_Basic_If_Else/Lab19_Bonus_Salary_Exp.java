package Ex_Java_Basic_If_Else;

import java.util.Scanner;

public class Lab19_Bonus_Salary_Exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary");
        int Sal = sc.nextInt();
        System.out.println("Enter the Years of Experience");
        int Yr = sc.nextInt();
        int Bonus;

        if (Yr <=1){
            System.out.println("No bonus");
        }
        else if (Yr > 1 && Yr <=3) {
            Bonus = Sal * 5 /100 ;
            System.out.println("Bonus is 5% of the salary." + Bonus);

        }
        else if (Yr > 3 && Yr <=6) {
            Bonus = Sal * 10 /100;
            System.out.println("Bonus is 10% of the salary." + Bonus);

        }
        else {
            Bonus = Sal * 15 / 100;
            System.out.println("greater than 6 years: Bonus is 15% of the salary." + Bonus);

        }

    }
}
