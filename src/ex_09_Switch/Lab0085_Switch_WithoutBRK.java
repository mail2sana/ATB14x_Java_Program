package ex_09_Switch;

import java.util.Scanner;

public class Lab0085_Switch_WithoutBRK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Mon"); // if don't use break statement all will execute from the enter value
                case 2:
                    System.out.println("Tue");
                case 3:
                    System.out.println("Wed");
                case 4:
                    System.out.println("Thur");
                case 5:
                    System.out.println("Fri");
                case 6:
                    System.out.println("Sat");
                case 7:
                    System.out.println("Sun");
                default:
                    System.out.println("Invalid number");
            }
        }
                 else {
            System.out.println("Enter integer alone");

             }

        }

    }

