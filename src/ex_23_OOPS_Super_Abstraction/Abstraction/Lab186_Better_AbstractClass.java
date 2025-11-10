package ex_23_OOPS_Super_Abstraction.Abstraction;

public class Lab186_Better_AbstractClass {
    public static void main(String[] args) {
        Alto a = new Alto();
        a.drive();
    }
}











abstract class Car1{
    abstract void startcar();
    abstract void stopcar();
}
class Alto extends Car1 implements Tyre , Gear , Engine{
    void drive(){
        this.startcar();
        rubbertyre();
        blackcolortyre();
        engine();
        changegear();
        this.stopcar();
    }

    void startcar(){
        System.out.println("Starting the car");
    }

    void stopcar(){
        System.out.println("Stop the car");
    }

    @Override
    public void changegear() {
        System.out.println("Changing gear");
    }

    @Override
    public void rubbertyre() {
        System.out.println("Rubber tyre");
    }

    @Override
    public void blackcolortyre() {
        System.out.println("Blackcolor Tyre");
    }

    @Override
    public void engine() {
        System.out.println("Start Engine");
    }
}
interface Tyre{
   abstract void rubbertyre(); // by default is abstract whether type keyword abstract or not
    void blackcolortyre(); // function
}
interface Gear{
    void changegear();
}
interface Engine{
    void engine();
}