package ex_23_OOPS_Super_Abstraction.Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        //car
        car tesla = new car(300);
        tesla.drive();
    }

}













class vehicle{
    public int maxspeed =180;

    void noTest(){
        System.out.println("Empty!");
    }
    vehicle(){
        System.out.println("Default consrtuctor");
    }
    vehicle(int a){
        System.out.println("Parameterized const");
    }
    vehicle(int a , int b){
        System.out.println("Prarameterized constr");
    }
    //method overloading - same, same name function with different argument
    void message(){
        System.out.println("No return , no argument");
    }
    void message(int a){
        System.out.println("PC-argument");
    }
    void drive(){
        System.out.println("Vehicle parent");
    }
}
class car extends vehicle{
    private int maxspeed=218;
    car(){
        super(100);
    }
    car(int a){
        System.out.println("PC");
    }
    void test(){}
@Override
    void drive(){
        System.out.println("over ridden the vehicle");
        System.out.println(super.maxspeed); // 180
        System.out.println(this.maxspeed); // 281
        super.noTest();
        this.test();
    }
}
