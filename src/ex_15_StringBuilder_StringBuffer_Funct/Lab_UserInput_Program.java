package ex_15_StringBuilder_StringBuffer_Funct;

import java.util.Scanner;

public class Lab_UserInput_Program {
    public static void main(String[] args) {
        // get input from user
        Scanner sn=new Scanner(System.in);
        // ask name
        System.out.println("Enter Your Name");
        String name= sn.nextLine();
        // ask age
        System.out.println("Enter your age");
        int age=sn.nextInt();
        //Display o/p
        System.out.println("Hello "+name+"!You are "+age+"years old");
        sn.close();

    }
}
