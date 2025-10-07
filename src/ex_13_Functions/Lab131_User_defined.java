package ex_13_Functions;

public class Lab131_User_defined {
    public static void main(String[] args) {

  /*     int result=sum_of_2no();
        System.out.println(result); */

        int result = sum_of_2no(3,4);
        int result2 = sum_of_2no(88,44);
        System.out.println(result);
        System.out.println(result2);
    }
   /* static int sum_of_2no(){
        return 30+20;
   */
    static  int sum_of_2no(int a, int b){
        return a+b;
    }
}
