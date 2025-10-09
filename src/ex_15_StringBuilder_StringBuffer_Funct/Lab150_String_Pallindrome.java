package ex_15_StringBuilder_StringBuffer_Funct;

public class Lab150_String_Pallindrome {
    public static void main(String[] args) {
        // madam -> reverse -> madam
        // naman -> reverse -> naman

        String input="Madam";
        String reversed="";

        for (int i = input.length()-1; i >=0 ; i--) {
            reversed=reversed+input.charAt(i);
        }
        if (reversed.equalsIgnoreCase(input)){

            System.out.println("Pallindrom");
        }
        else {
            System.out.println("Not a Pallindrom");
        }
    }
}
