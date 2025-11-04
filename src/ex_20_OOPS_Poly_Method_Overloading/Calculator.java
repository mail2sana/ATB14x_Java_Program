package ex_20_OOPS_Poly_Method_Overloading;

public class Calculator {
    public static void main(String[] args) {
        calc c1 = new calc();
        // c1 is you
        c1.add(3, 4); // which method it will call int method
       // c1.add(3.58,7.6);

    }
}

class calc{
   // eg. wife
    int add(int a, int b){
        return  a+b;
    }
    // same function in both return type -> add but type is different int, double so this can use(call)
    //eg.mother
    double add(double a, double b) {
        return a + b;
    }
        long add(long a, long b){
            return a+b;
        }
    }
