package ex_23_OOPS_Super_Abstraction.Abstraction;

public class Lab191_Interface_Variable {
    public static void main(String[] args) {

    }
}
interface pramod{
    int a=10; // JVM know already interface variable always final
    void display();
}
class dutta implements pramod{
    int aa=11;
    @Override
    public void display() {
        System.out.println(a); // final variable access directly
        System.out.println(this.aa);
    }
}
