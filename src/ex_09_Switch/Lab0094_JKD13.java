package ex_09_Switch;

public class Lab0094_JKD13 {
    public static void main(String[] args) {
        int itemcode =006;
        switch (itemcode){
            case 001,002,003 -> System.out.println("All of them are electronic gadget");
            case 004,005,006 -> System.out.println("this is mech");
            default -> System.out.println("NONE");
        }
    }
}
