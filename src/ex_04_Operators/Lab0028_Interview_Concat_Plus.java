package ex_04_Operators;

public class Lab0028_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        String first_name="promod";
        String LAst_name="dutta";
        System.out.println(first_name+LAst_name+a+b); // promoddutta1010
        System.out.println(a+b+first_name+LAst_name);  // 20promoddutta
    }
}
