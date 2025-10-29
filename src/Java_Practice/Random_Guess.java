package Java_Practice;

import java.util.Random;
import java.util.Scanner;

public class Random_Guess {
    public static void main(String[] args) {
        Random R = new Random();
        int GuessNo = R.nextInt(100);
        System.out.println(GuessNo);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num;
       int attempts = 0;

        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Enter integers only");
                sc.next();
                continue;

            }
            num =sc.nextInt();
            attempts++;

            if (num < 1 || num > 100) {
                System.out.println("Enter a number between 1 to 100");
                continue;
            }

            if (num < GuessNo){
                System.out.println("Too low try again");
            }
            else if (num > GuessNo) {
                System.out.println("Too high try again");
            }
            else {
                System.out.println("Correct you guessed it" +attempts +"attemptss");
                break;
            }


        }
    }
}