package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_2Highest_Number {
    public static void main(String[] args) {
        int[] numbers={12,34,10,1,100,3,4,32}; // 100 , 34
        // with in built functin
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);



    }
}
