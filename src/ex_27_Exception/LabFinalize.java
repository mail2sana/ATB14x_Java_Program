package ex_27_Exception;

public class LabFinalize {
    public static void main(String[] args) {
        LabFinalize fb = new LabFinalize();
        fb = null;
        System.gc();
        System.out.println("Main method clone");
    }


    public void finalize() {
        System.out.println("Hi i called");
    }
}