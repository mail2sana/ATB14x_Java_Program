package ex_19_OOPS_Single_Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Lab168_SI {
    public static void main(String[] args) {
        Son promod = new Son();

        System.out.println(promod.gold);
        promod.bhk2();
        promod.bhk3();

        Father F1 = new Father();
        System.out.println(F1.gold);
        F1.bhk2();
      //  F1.bhk3(); father can't use sons property

    }
}
