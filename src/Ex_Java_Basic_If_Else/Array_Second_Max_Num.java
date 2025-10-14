package Ex_Java_Basic_If_Else;

public class Array_Second_Max_Num {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32}; // o/p is 34

        int max=numbers[0];
        int secondmax=numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]>max){
                secondmax=max;
                max=numbers[i];
            }
            else if (numbers[i]<max && numbers[i]>secondmax) {
                secondmax=numbers[i];

            }

        }
        System.out.println(secondmax);


    }
}
