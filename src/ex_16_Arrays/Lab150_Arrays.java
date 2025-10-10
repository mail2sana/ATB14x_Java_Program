package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {
        int marks[]={1,2,3,4,5,6};

        System.out.println(marks[0]);
        System.out.println(marks[2]);

        // 2 way to create the array
        int[] mark1=new int[5];
        int mark2[]=new int[5]; // fixed size bothe are same array declaration any patter you can use

        // String array
        String[] names=new String[3];
        names[0]="pramod";
        names[1]="Amit";
        names[2]="yash";
        System.out.println(names[1]);


    }
}
