package ex_20_OOPS_Poly_Method_Overloading;

public class Lab187_Method_Ovrload {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1= m1.add(6,5);
        String r2 = m1.add("Sana","Natasha");
        double r3 = m1.add(3.54, 9.68);

    }
}

class MathOperations{
// in the same class when you have
    // same name methods but different arguments and different return type

    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return  a+b;
    }
    String add(String a, String b){
        return a+b;
    }
}
