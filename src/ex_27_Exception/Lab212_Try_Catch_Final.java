package ex_27_Exception;

public class Lab212_Try_Catch_Final {
    static void main() {
        int a=1;
        int c=0;
        try{
            c=10/0;
                    }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be always executed");
        }
        System.out.println(c);
    }
}

