package ex_16_Arrays;

public class Lab156_Sum_Of_Arrays {
    public static void main(String[] args) {
        int[] numbers={58,68,74};
        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            sum = sum + numbers[i];
        }
            System.out.println(sum);
            
        }
    }

