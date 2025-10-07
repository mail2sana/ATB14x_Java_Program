package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = readint(scanner,"Enter Num1");
        int b=readint(scanner, "Enter Num2");

        // calling arthmetic functions
        int Sum = sum(a,b);
        System.out.println(Sum);

        int Sub = sub(a,b);
        System.out.println(Sub);

        int Mul = mult(a,b);
        System.out.println(Mul);

        int Div = div(a,b);
        System.out.println(Div);

        int Mod = modul(a,b);
        System.out.println(Mod);


    }
    // This is type 4 WP , WR
static int readint(Scanner scanner, String prompt){
    System.out.println(prompt);
// user input scnnaer integer only return if not integer alert enter number
    if(scanner.hasNextInt()){
        return scanner.nextInt();
    }else {
        System.out.println("Enter the integer only");
        System.exit(0);
        return 0;
    }
}
static int sum(int a, int b){
        return a+b;
}
static int sub(int a, int b){
        return a-b;
}
static int mult(int a, int b){
        return a*b;
}
static int div(int a, int b) throws ArithmeticException{
if(b==0){
    throw new ArithmeticException("Division by 0 is not allowed");
}
return a/b;
}
static int modul(int a, int b){
        return a % b;
}
}
