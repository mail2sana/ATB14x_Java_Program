package ex_10_For_Loop;

public class Lab111_ForLoop_Break {
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) { // 0 to 49 , 50 times
        //    System.out.println(i); // if print before if condition will print 0 to 5
            if(i==5){
                break;
            }
            System.out.println(i);
             // if print before if condition will print 0 to 4

        }
    }
}
