package Ex_Java_For_WhileLoop.Java_26Oct_WhileLoop;

public class Lab4_sum_first10_naturalno {
    public static void main(String[] args) {
       int i=1;
        int n=10;
        int sum=0;

        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum of first 10 natural number is ->" +sum );

    }
}
