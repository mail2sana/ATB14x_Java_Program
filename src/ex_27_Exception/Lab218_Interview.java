package ex_27_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab218_Interview {
    static void main() {
        try{
            FileReader f=new FileReader("C://abc.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
