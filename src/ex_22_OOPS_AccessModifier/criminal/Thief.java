package ex_22_OOPS_AccessModifier.criminal;

import ex_22_OOPS_AccessModifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop T1 = new Cop(100);
     //   T1.canishoot();  private - not allowed ,public - allowed
     //   T1.thisDefaultF1(); // default also not allowed another package
    }
}
