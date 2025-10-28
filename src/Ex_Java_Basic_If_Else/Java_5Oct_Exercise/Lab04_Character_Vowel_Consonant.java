package Ex_Java_Basic_If_Else.Java_5Oct_Exercise;

public class Lab04_Character_Vowel_Consonant {
    public static void main(String[] args) {
        char ch='A';
        if (ch=='a' || ch=='A' || ch=='e' ||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println(ch + " is vowel");
        }
        else {
            System.out.println(ch + " is consonant");
        }
    }
}
