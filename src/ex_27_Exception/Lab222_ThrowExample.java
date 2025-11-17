package ex_27_Exception;

import java.util.Scanner;

public class Lab222_ThrowExample {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int user_age = sc.nextInt();
        Validate_age_clubbing(user_age);
    }

    static void Validate_age_clubbing(int age) {
        if (age < 25) {
            try {
                throw new Exception("Age can't be less than 25");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Enjoy Clubbing");
        }
    }
}
