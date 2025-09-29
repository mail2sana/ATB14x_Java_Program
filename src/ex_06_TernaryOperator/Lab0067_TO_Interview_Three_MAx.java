package ex_06_TernaryOperator;

public class Lab0067_TO_Interview_Three_MAx {
    public static void main(String[] args) {
        int n1=2 , n2= 9, n3=-11;

        int max = n1>n2 ? n1 : (n2>n3 ? n2 : n3);
        System.out.println(max);

    }

}
