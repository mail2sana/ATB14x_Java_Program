package ex_15_StringBuilder_StringBuffer_Funct;

import java.util.Scanner;

public class Lab_Grade_Switch {
    public static void main(String[] args) {
        Scanner input_val = new Scanner(System.in);
        System.out.println("Enter the marks out of 100");
        while  (true)
        {
            if (!input_val.hasNextInt())
            {
                System.out.println("Kindly Enter the Integer only");
                input_val.next(); // To again ask for the number to enter
            }else {
                int a = input_val.nextInt();
                if (a<0 || a>100)
                {
                    System.out.println("Enter the marks out of 100 only");
                }
                else {
                    char grade;
                    switch(a/10)
                    {
                        case 10 :
                            System.out.println("A");
                            grade ='A';
                            break;
                        case 9 :
                            System.out.println("A");
                            grade ='A';
                            break;
                        case 8 :
                            System.out.println("B");
                            grade ='B';
                            break;
                        case 7 :
                            System.out.println("C");
                            grade ='C';
                            break;
                        case 6 :
                            System.out.println("D");
                            grade ='D';
                            break;
                        default :
                            System.out.println("F");
                            grade ='F';
                            break;
                    }
                    System.out.println("Your grade for your marks is " + grade);
                }
            }
        }

    }
}


