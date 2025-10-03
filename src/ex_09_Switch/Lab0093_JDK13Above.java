package ex_09_Switch;

public class Lab0093_JDK13Above {
    public static void main(String[] args) {
        // in jdk > 13
        int itemcode=001;
        switch(itemcode){
            case  001 -> System.out.println("001");
            case  002 -> System.out.println("002");
            case  003 -> System.out.println("003");
            default -> System.out.println("default");

        }
    }
}
