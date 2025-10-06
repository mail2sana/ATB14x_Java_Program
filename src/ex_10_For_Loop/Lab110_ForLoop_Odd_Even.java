package ex_10_For_Loop;

public class Lab110_ForLoop_Odd_Even {
    public static void main(String[] args) {
        // to find even number from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even->" + i);
            }
/*
            for (int i = 1; i <= 50; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd->" +i);
                }
                }
 */


        }
    }
}
