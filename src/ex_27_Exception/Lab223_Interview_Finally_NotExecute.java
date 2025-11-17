package ex_27_Exception;

public class Lab223_Interview_Finally_NotExecute {
    static void main() {
        try {
            int a=10/10;
            System.out.println("Try executed");
            System.exit(0); // when .exit finally will not be executed
        } catch (Exception e) {
            System.out.println("Catching the exception");
        } finally {
            System.out.println("I will be always execcuted");
        }

    }
}

