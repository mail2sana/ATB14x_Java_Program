package Java_Practice.Array_Pract;

public class Array_Loop {
    public static void main(String[] args) {
        int[] marks = {68,98,48,82,76};
        System.out.println(marks.length);
        System.out.println("----------x----------");

        //  for loop
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("----------x----------");

        // for each loop
        for (int mark:marks){
            System.out.println(mark);
        }
    }
}
