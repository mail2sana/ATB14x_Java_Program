package Ex_Java_Basic_If_Else.Java_24Oct_Exercise;

import java.util.Scanner;

public class Lab23_Days_Years_Months_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Days");
        int days = sc.nextInt();
        int years, month; //weaks;

        if (days>0) {

            years = days / 365;
            System.out.println("No. of years -> " + years);

            month = (days % 365) / 30;
            System.out.println("No. of months ->" + month);

       /* weaks =(days%365)/7;
        System.out.println("No. of weeks -> " + weaks);

        */
            days = (days % 365) % 30;
            System.out.println("No of days -> " + days);

            System.out.println("Valid Days ->" + years + " Years ," + month + " Months and "+days + " days.");

        }
        else {
            System.out.println("Invalid days input");
        }

    }
}
