package ex_10_For_Loop;

public class Lab0102_For_No_Condition {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);
// infinite loop bcoz there is no condition
            // exit code 130 - Stopped by yourself-kill
            // exit code 0 - successful
        }
    }
}
