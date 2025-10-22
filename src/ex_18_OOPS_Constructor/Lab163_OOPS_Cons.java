package ex_18_OOPS_Constructor;

public class Lab163_OOPS_Cons {
    public static void main(String[] args) {
     A a1 = new A();
        System.out.println(a1);

    }
}
class A{
    A(){
        System.out.println("I want to read a csv file");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do anything which you want to do, when object is created");
    }
}
