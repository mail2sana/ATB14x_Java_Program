package ex_23_OOPS_Super_Abstraction.Abstraction;

public class Lab187_Interface_P1 {
    static void main() {
        Car2 c2 = new Car2();
        c2.drive();
// interface object cannot do
     //   Break B1 =new Break();

    }
}








class Car2 implements Break , Engine1 {
 void drive(){
     startEngine();
     applyBreak();
     stopEngine();

}
    @Override
    public void applyBreak() {
        System.out.println("Apply Break 55");
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine 55");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine 55");
    }
}
interface Break{
    void applyBreak();
}
interface Engine1{
    void startEngine();
    void stopEngine();

    // unlimited default method allowed
    default void testEngine(){
        System.out.println("Concrete complete");
    }
    default void testEngine1(){
        System.out.println("Concrete complete");
    }
}