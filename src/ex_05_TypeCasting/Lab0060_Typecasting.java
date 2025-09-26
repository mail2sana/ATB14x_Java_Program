package ex_05_TypeCasting;

public class Lab0060_Typecasting {
    public static void main(String[] args) {
        long mobile= 9587456123l;
      //  short s=mobile; / narrowing --> implicit not possible
        short s=(short)mobile; //narrowing -->explicit
        System.out.println(s);



    }
}
