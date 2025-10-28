package Ex_Java_Basic_If_Else.Java_17Oct_Exercise;

public class Lab07_Smallest_Two_Numbers {
    public static void main(String[] args) {
        int n1=26;
        int n2=9;
/*
        int min=n1<n2 ? n1: n2;
        System.out.println("Smallest of 2 numbers is ->" + min);

 */

        if(n1<n2){
            System.out.println("Smallest of 2 number is ->" + n1);
        }
        else {
            System.out.println("Smallest of 2 number is ->" + n2);
        }

    }
}
