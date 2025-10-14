package ex_16_Arrays;

public class Lab164_2nd_Highest_Array {
    public static void main(String[] args) {
        int[] numbers={12,45,67,23,89,45,89};
        int highest=0;
       int secondhighest=0;

        for (int num : numbers) {
            if(num>highest){
                secondhighest=highest;
                highest=num;
            }
            else if (num>secondhighest && num!=highest) {
              secondhighest=num;
                
            }

        }
        System.out.println("Second highest number is " + secondhighest);
        System.out.println("Highest number is " + highest);
    }
}
