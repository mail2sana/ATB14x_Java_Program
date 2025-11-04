package ex_20_OOPS_Poly_Method_Overloading;

public class Lab188_Real_MethodOverload {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        h1.task("Bathroom Cleaning");
    }
}
class Home{
    void task(){
        System.out.println("Task Fan cleaning");
    }
    void task(String whichtask){
        System.out.println("Task ->" + whichtask);
    }
}