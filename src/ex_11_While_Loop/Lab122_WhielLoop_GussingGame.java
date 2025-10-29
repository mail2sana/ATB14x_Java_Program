package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab122_WhielLoop_GussingGame {
    public static void main(String[] args) {
        // guess number 1 to 100
        // get user input

        // this random is class which guess the integer function
        Random random=new Random();
        int numberToGuess= random.nextInt(100);
     // System.out.println(numberToGuess);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts=0;

        while (true){
            if(!scanner.hasNextInt()) {
                System.out.println("Invalid input, Please enter a number");
                scanner.next();
                continue;
            }
    guess= scanner.nextInt();
        attempts++;

if(guess < 1 || guess > 100) {
    System.out.println("Pls enter a number between 1 to 100");
    continue;
}

if(guess < numberToGuess){
    System.out.println("Too loo , try again");
} else if (guess > numberToGuess) {
    System.out.println("Too high, try again");
}
else {
    System.out.println("correct you guessed it in " +  attempts +  " attempts");
    break;
}
}
    }
}
