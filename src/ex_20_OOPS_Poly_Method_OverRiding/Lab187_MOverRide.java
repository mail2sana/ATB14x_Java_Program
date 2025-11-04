package ex_20_OOPS_Poly_Method_OverRiding;

public class Lab187_MOverRide {
    public static void main(String[] args) {
        // Runtime polymorphism

        Pramod p1 = new Pramod();
        p1.home(); // this calls pramod property 3bhk

        Father f1=new Father();
        f1.home(); // This calls father property 2bhk

        Father f2 = new Pramod(); // Dynamic dispatch
        f2.home(); // this call pramod (obj) property 3 bhk

       //  Pramod p2 = new Father();
        //-> this is not possible because pramod extends the father not father extend pramod

    }
}
class Father{
    void home(){
        System.out.println("2 BHK");
    }
}
class Pramod extends Father{
    @Override
    void home(){
        System.out.println("3 BHK");
    }
}
