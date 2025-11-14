package ex_27_Exception;

public class Lab217_Interview {
    static void main() {
        final double pi=3.14;
        int a=0;
        try{
            int x=10/a;
                    }
        catch (Exception e){
            System.out.println("div by Zero");
        }
        finally {
            System.out.println("I will be executed abyhow");
        }
    }
}
