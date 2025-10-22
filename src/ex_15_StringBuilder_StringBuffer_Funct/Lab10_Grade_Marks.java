package ex_15_StringBuilder_StringBuffer_Funct;

import java.util.Scanner;

public class Lab10_Grade_Marks {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Pls Enter you score");
        int score= sn.nextInt();

        if(score>=90 && score<100){
            System.out.println("Grade A+");
        } else if (score>=80 && score<89) {
            System.out.println("Grade A");
        } else if (score>=70 && score<79) {
            System.out.println("Grade B");
        } else if (score>=60 && score<69) {
            System.out.println("Grade C");
        } else if (score>=50 && score<59) {
            System.out.println("Grade D");
        } else if (score>=40 && score<49) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Fail");
        }
    }
}
