package ex_16_Arrays;

public class Lab_Arrays_Declaration {
    public static void main(String[] args) {
      //  int[] marks={71,92,66,88,44,};
     //   String[] names={"Anil","sunil","Panil"};

        int[] marks=new int[3];
        marks[0]=99;
        marks[1]=88;
        marks[2]=68;
        System.out.println(marks[2]);

        String[] names=new String[3];
        names[0]="Anil";
        names[1]="sunil";
        names[2]="panil";
        System.out.println(names[0]);

    }
}
