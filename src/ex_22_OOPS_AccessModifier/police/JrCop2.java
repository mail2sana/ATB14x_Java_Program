package ex_22_OOPS_AccessModifier.police;

public class JrCop2 {
    public static void main(String[] args) {
        Cop j2 = new Cop(100);
        j2.thisDefaultF1(); // default allowed within the package same as procted
    }
}
