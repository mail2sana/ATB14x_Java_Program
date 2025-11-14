package ex_27_Exception;

public class Lab204_Exception {
    public static void main(String[] args) {
        System.out.println("Start the program");
// Runtime Unchecked exception
        String ip = args[0]; // no input given in argument Exception- Runtime (unchecked) - Out of bound
        int a= Integer.parseInt(ip); // when gice string in agrg Number format exception due to parseint not convert string
        int b=100 / a; // 100/0 is not possible so Arithmetic Excception
        System.out.println(b);

        System.out.println("End of the program");

    }
}

