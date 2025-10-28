package Ex_Java_Basic_If_Else;

import javax.print.attribute.HashPrintRequestAttributeSet;
import java.util.Scanner;

public class Lab20_Employee_Net_Salary {
    public static void main(String[] args) {
        // Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Pay");
        double Basic_Pay = sc.nextDouble();
        double HRA, DA , Tax, Gross, Net_Sal;

        HRA = Basic_Pay * 0.20;
        System.out.println("The HRA is -> " + HRA);

        DA = Basic_Pay * 0.10;
        System.out.println("The DA is -> " + DA);

        Gross = Basic_Pay + HRA + DA;
        System.out.println("Goss Sal is -> " + Gross);

        if (Gross <= 700000){
            Tax=0;
        }
        else {
            Tax = Gross * 0.10;
            System.out.println("Tax is -> " + Tax);

            Net_Sal = Gross-Tax;

            System.out.println("Net Salary is Rs.->" + Net_Sal);

        }


    }
}
