package ex_10_For_Loop;

public class Lab108_ForLoop_3 {
    public static void main(String[] args) {
        for (int i = -1; i >-10 ; i--) {
            System.out.println(i);
            // it will print the value upto -9
        }
        // can initiliaze i out side of loop -> yes we can initialize
        int i=10;
        for(;i<10;i++);
        System.out.println(i);
    }
}
