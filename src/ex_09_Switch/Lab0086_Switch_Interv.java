package ex_09_Switch;

import java.util.Scanner;

public class Lab0086_Switch_Interv {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num 1 to 7");
        int day = scanner.nextInt();

        switch(day){
            case 1 :
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
// case will not execute if enter the invalid input apart from the case

        }
    }
}
