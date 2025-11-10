package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_returntype_function();
        String name=return_string_function();
        System.out.println(name);
        Float f = return_float();
        System.out.println(f);

    }
    // NON return type
    static void non_returntype_function(){
        System.out.println("He, there , No return Function");
        // print is just a statement not return type
            }
// Return type
    static String return_string_function(){
        System.out.println("Hi, there, I will return something");
        return "pramod"; // this is actual return type
    }
    static boolean return_boolean(){

        return true;
    }
    static float return_float(){
        return 589.54f;
    }
    static byte return_byte(){

        return 100;
    }
    static long return_long(){

        return 78965222l;
    }
}

