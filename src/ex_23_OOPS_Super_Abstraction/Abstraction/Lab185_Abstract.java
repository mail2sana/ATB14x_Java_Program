package ex_23_OOPS_Super_Abstraction.Abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.loan10k();
        s1.loan50k();
    }
}



abstract class Father{
    // when abstract use the class will also became abstract - > hidden
    abstract void loan10k();

    // this is normal class complete class
    void loan50k(){
        System.out.println("Given");
    }

}
class Son extends Father{

    @Override
    void loan10k() {
        System.out.println("Hi Im amit , I will give the father loan of 10k");
    }
}
