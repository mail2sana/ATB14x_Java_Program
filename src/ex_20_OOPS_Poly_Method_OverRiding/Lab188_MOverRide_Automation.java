package ex_20_OOPS_Poly_Method_OverRiding;

public class Lab188_MOverRide_Automation {
    public static void main(String[] args) {
        // Dynamic binding
        CommonToAll c1 =new CommonToAll();
        c1.browser();

        ChromeTc c2=new ChromeTc();
        c2.browser();

        // Dynamic dispatch
        CommonToAll c3=new ChromeTc();
        c3.browser();

        CommonToAll c4=new FirefoxTc();
        c4.browser();

        // Invalid
   //     ChromeTc T1 = new FirefoxTc();
  //      ChromeTc t2 = new CommonToAll();


    }
}

class CommonToAll{
    void browser(){
        System.out.println("Starting Default browser is IE");
    }
}
class ChromeTc extends CommonToAll{
    @Override
    void browser() {
        System.out.println("Starting Chrome , Better browser");
    }
}
class FirefoxTc extends CommonToAll{
    void browser(){
        System.out.println("Firefox browser");
    }
}
