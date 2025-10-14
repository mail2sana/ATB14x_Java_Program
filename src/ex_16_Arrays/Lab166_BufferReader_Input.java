package ex_16_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab166_BufferReader_Input {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int num=Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(num);
    }
}
