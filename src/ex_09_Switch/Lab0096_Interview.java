package ex_09_Switch;

public class Lab0096_Interview {
    public static void main(String[] args) {
        char code ='C';
        switch(code){
            default:
                System.out.println("Helloe");  // np break so executed case A also
            case 'A' :
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
        }
    }
}
