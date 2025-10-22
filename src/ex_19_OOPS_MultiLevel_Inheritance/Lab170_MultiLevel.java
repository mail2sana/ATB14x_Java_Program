package ex_19_OOPS_MultiLevel_Inheritance;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son pramod =new Son();
        pramod.home();
        pramod.extra(); // Son access Father's property
        pramod.BHK();   // Son access his own property
        pramod.gf();   // Son access GrandFather's property

        Father F1 = new Father();
        F1.gf();   // Father access GrandFather's property
        F1.extra(); // Father access his own property
       //  F1.BHK(); can't access son's property

        GrandFather GF = new GrandFather();
        GF.gf(); // Grandfather access his own property
      //  GF.extra(); can't access son's property
      //  GF.BHK();   can't access grand son's property

        // Dynamic Dispatch
        GrandFather g1 =new Son();
        Father f1 = new Son();
     //   Son s1 = new GrandFather();// this is not possible
     //   Son S2 = new Father(); this is not possible

    }
}
