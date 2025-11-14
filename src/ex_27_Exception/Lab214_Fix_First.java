package ex_27_Exception;

public class Lab214_Fix_First {
    static void main(String[] args) {
        try {
            String ip = args[0]; // array index out of bound exception
            int a = Integer.parseInt(ip); //Number Format exception
            int b = 100 / a; // Arithmetic Exception
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException|IndexOutOfBoundsException e) {
            System.out.println("Problem");
        }
        finally {
            System.out.println("I will be always called");
        }
    }

}
