package ex_19_OOPS_Hierarchical_Inheritance;

public class Lab171_Hierarchical {
    public static void main(String[] args) {
        Raj r1 =new Raj();
        r1.Home();
        r1.H2();

        Lucky l1 = new Lucky();
        l1.Home();
        l1.H3();

        Ruhani r2 = new Ruhani();
        r2.H4();
        r2.Home();

        // Raj can't access lucky , ruhani -> raj can access Father's and his own
        // Lucky can't access Raj , Ruhani -> lucky can access Father's and his own
        // Ruhani can't access Raj , Lucky -> ruhani can access Father's and his own



    }
}
