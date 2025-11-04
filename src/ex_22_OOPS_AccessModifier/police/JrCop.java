package ex_22_OOPS_AccessModifier.police;

public class JrCop {
    public static void main(String[] args) {
        Cop Jrcop = new Cop(200);
      //  Jrcop.canishoot ; private - not allowed  ,
        Jrcop.canishoot(); // protected - allowed within the package
    }
}
