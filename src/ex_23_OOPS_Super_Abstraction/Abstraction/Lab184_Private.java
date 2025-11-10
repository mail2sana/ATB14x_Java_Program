package ex_23_OOPS_Super_Abstraction.Abstraction;

public class Lab184_Private {
}
class XYZ{
    XYZ(){
    }
    protected int my_gold=10;
    //private cannot access super parent class ,if it is protected, default, public can be accessible
}
class cab extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
}
