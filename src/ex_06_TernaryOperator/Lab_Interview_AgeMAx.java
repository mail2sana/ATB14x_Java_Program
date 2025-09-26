package ex_06_TernaryOperator;

public class Lab_Interview_AgeMAx {
    public static void main(String[] args) {

    int age = 66;
    String result = age <18 ? "Minor" : age<=60 ? "Adult" : "Senior";
        System.out.println(result);
}
}