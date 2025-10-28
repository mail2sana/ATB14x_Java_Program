package Ex_Java_Basic_If_Else;

import java.util.Scanner;

public class Lab14_Triangle_Valid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 7, 10 , 5 - all sides equal
        // 1 , 10, 12 - not equal

        if (a+b > c && a+c > b && b+c > a){
            System.out.println("Is valid triangle");
        }
        else {
            System.out.println("Invalid triangle");
        }
    }
}
