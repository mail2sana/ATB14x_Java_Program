package ex_27_Exception;

public class Lab207_Try_Catch {
    public void main(String[] args){
        String s1=null;
        //  line 8 need to handle
        // Runtime unchecked - Null pointer exception
        //Handling the exceptions by using the Try and catch to execute
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Error, Trim not allowed for the null value");
        }
    }
}

