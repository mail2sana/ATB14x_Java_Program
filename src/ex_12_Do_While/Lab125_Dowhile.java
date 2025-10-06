package ex_12_Do_While;

public class Lab125_Dowhile {
    public static void main(String[] args) {
        int a=1;  // initialize
        do{
            System.out.println("Body!");
            System.out.println(a);  // Body
            a++;
        }while(a<10); // Condition
    }
}
