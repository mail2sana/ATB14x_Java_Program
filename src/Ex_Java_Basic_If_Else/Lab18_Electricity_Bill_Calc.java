package Ex_Java_Basic_If_Else;

import java.util.Scanner;

public class Lab18_Electricity_Bill_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Electricity units");
        int units = sc.nextInt();

        float rs = 0.0f , bill;

        if (units<=100) {
            bill = units * 0.5f;
        }
        else if (units<=200){
            bill = units *0.75f;
        }
        else if (units<=300){
          bill = units *1.20f;
        }
        else {
            bill= units  * 1.5f;
        }
        System.out.println("Your electricity bill is " + bill);
              }
    }

