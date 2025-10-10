package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a=10; // normal local integer
        int marks[]={88,65,79,69,93,94,92}; // this is array 7 elements

        boolean[] married_people={true, false};

        System.out.println(marks.length);
        System.out.println(marks[0]); // 88
        System.out.println(marks[4]); //93
      //  System.out.println(marks[-1]); // not possible negative not allowed in array

        String name="pramod";
        String[] element_char=name.split(""); // ["p","r","o","m","d"]

        for (String s: element_char){
            System.out.println(s);
        }
    }
}
