package Java_Practice;

public class Max3n_Nested_Ternary {
    public static void main(String[] args) {
        int n1 = 0, n2=44, n3=-8;

        int max = n1>n2 ? n1 : (n2>n3 ? n2 : n3);
        System.out.println(max);

    }
}
