package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        // User defined function

        // 1. Without parameters without Return type
        wop_wor_great();

        // 2. Without parameters with Return type
        String msg = wop_wr_great();
        System.out.println(msg);

        // 3. With parameter and without Return type
        greet_with_details("pramod", 65, 100);

        // 4. With parameter with return type
        int sum = sum_of_2nos(5, 7);
        System.out.println(sum);

    }

    // 1. Without parameters without Return type
    static void wop_wor_great() {
        System.out.println("Hi, Type1 function!");
        System.out.println("Hi, there");
    }

    // 2. Without parameters with Return type
    static String wop_wr_great() {
        System.out.println("Hi, Type2 function!");
        return "Hi, How are you?";
    }

    // 3. With parameter and without Return type
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is->" + name + "\nYour age is" + age + "\n Your salary is" + salary);
    }

    // 4. With parameter with return type
    static int sum_of_2nos(int a, int b) {
        return a + b;
    }

    static float sum_of_3nos(float a, float b, float c) {
        return a + b + c;
    }
}