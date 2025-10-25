package Ex_Java_Basic_If_Else;

public class Lab11_Character_Alphabet {
    public static void main(String[] args) {
        char C = 'x'; // C='#' ;
// usinf inbuilt function
        /*
        if (Character.isAlphabetic(C) ){
            System.out.println(C + " -> The charachter is an alphabet");
        }
        else{
            System.out.println(C + " -> The charachter is not an alphabet");
        }

         */
// without using inbuilt function
        if ((C>= 'a' && C<'z') || (C>='A' && C<'Z')) {
            System.out.println(C + " -> The charachter is an alphabet");
        }
        else {
            System.out.println(C + " -> The charachter is not an alphabet");
        }

    }

}
