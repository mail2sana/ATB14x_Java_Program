package Java_Practice;

public class Agewise_Calcu_Nested_Ternary {
    public static void main(String[] args) {
        int age = 55;

        String result = age<18 ? "Minor" : age<=60 ? "Adult" : "senior" ;
        System.out.println(result);
    }
}
