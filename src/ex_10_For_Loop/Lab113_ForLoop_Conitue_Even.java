package ex_10_For_Loop;

public class Lab113_ForLoop_Conitue_Even {
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++) { // 0 to 50 -> 51 times
       //     if (i%2==0){ // print odd numbers 1,3,5,7....
            if(i%2!=0){    // // print even numbers 0,2,4,6,8
                continue;
            }
            System.out.println(i);

        }
    }
}
