package ex_15_StringBuilder_StringBuffer_Funct;

import java.util.Scanner;

public class Lab_Grade_Calculator_Program {
    /*  Write a program that calculates and displays the letter grade for a given numerical score
     (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score pls");
        int score = scanner.nextInt();

        if (score>=90 && score<100) {
            System.out.println("Congratulation your Grade is A");
        }
        else if (score>=80 && score<89) {
            System.out.println("Good your Grade is B");

        }

        else if (score>=70 && score<79) {
            System.out.println("Improve your Grade is C");

        }
        else if (score>= 60 && score<69) {
            System.out.println("Normal your Grade is D");

        }
        else {
            System.out.println("Need to Improve your Grade is F");
        }
    }
}