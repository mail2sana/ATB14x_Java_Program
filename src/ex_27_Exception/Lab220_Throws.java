package ex_27_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220_Throws {
    static void main(String[] args) throws FileNotFoundException {
        // checked JvM know it
        try {
            FileReader f=new FileReader(new File("C://txt.com"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("yes");
    }
}

}
