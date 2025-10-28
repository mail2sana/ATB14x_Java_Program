package Ex_Java_Basic_If_Else.Java_17Oct_Exercise;

public class Lab08_Smallest_Three_Numbers {
    public static void main(String[] args) {
        int n1=21;
        int n2=46;
        int n3=79;

        if(n1<n2){
            System.out.println("Smallest of three number is->" +n1);
        } else if (n2<n3) {
            System.out.println("Smallest of three number is->" + n2);
        }
        else {
            System.out.println("Smallest of three number is->" +n3);
        }
    }
}
