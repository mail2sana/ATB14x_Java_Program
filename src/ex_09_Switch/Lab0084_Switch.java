package ex_09_Switch;

import java.util.Scanner;

public class Lab0084_Switch {
    public static void main(String[] args) {
        // you need to take a user input and ask for the integer from 1to7
        //And if user enters 1 to 7
        // tell which day it is

        // LBF

        //step1: number one is using the scanner class
        //step2: basically figuring out the expressions and day
        //step3: basically add step3 as a rough logic
        //step4: fix the logic and optimize
        //step5: figure out the edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
    //    int age= scanner.nextInt(); if input is integer means this will apply
         // scanner.hasNext() --> boolean result if other than integer enters true or false statement will show
        if (scanner.hasNextInt()){
           int day = scanner.nextInt();
        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("please enter from 1 to 7 alone");
        }

        }
            else{
                System.out.println("Enter integer alone");
            }


    }
}
