package ex_16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab154_Array_UserInp {
    public static void main(String[] args) {
        //User input
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the size of an Array(int)");
        int size= sn.nextInt();

        String[] number_Marks= new String[size];

        for (int i = 0; i < number_Marks.length; i++) {
            System.out.println("Enter the elements->" + i);
            number_Marks[i] = sn.next();

        }
        System.out.println("------Print the values");

        Arrays.sort(number_Marks);
        for(String marks:number_Marks) {
            System.out.println(marks);
        }
            
        }
    }
