package ex_29_Generic;

public class Lab224 {
    static void main() {
        temp_sum(10,5);
        temp_sum(2.3,5.6);
        temp_sum("pramod", "Dutta");

    }
    // Integer use int datatype, double use double etc..
    /*
    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }
    static Double temp_sum(Double a, Double b){
        return a+b;
    }
     */

    // Common function for all data type any name use instead of T. removing the data type constrain
    // <T> - template size , T - return type
    static <T> T temp_sum( T a , T b){
        return null;
    }
}
