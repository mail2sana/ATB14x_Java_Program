package Java_Practice.Array_Pract;

public class Progr1_Max_Min {
    public static void main(String[] args) {
        int[] marks={45,68,97,83,74,58,39,27,15};
        System.out.println(marks.length);
        System.out.println("---------x-----------");

        int max=marks[0];
        for (int i = 0; i <marks.length; i++) {
             System.out.println(marks[i]);

            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("---------x-----------");
            System.out.println("MAx of array is ->" +max);

    }
}
