package Ex_Java_Basic_If_Else;

public class Lab06_Largest_Three_Numbers {
    public static void main(String[] args) {
       /* int n1=2 , n2= 9, n3=-11;
        int max = n1>n2 ? n1 : (n2>n3 ? n2 : n3);
        System.out.println(max);

        */
        int n1 =55;
        int n2 =36;
        int n3 =96;

        if (n1>=n2 && n1>=n3){
            System.out.println("N1 is Largest of all ->" +n1);
        } else if (n2>=n1 && n2>=n3) {
            System.out.println("N2 is Largest of all ->" +n2);
        }
        else {
            System.out.println("N3 is Largest of all ->" +n3);
        }
    }
}
