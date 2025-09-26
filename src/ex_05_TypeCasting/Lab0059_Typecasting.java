package ex_05_TypeCasting;

public class Lab0059_Typecasting {
    public static void main(String[] args) {
  //  byte b=600; // not valid
    int val=600;
   // byte b= val; // it invalid why unbale to bigger value into small jar, so ecplicit (forcing) converstaniion
    byte b= (byte)val; // its valid explit doing but forcing to do data loss will be there for sure
        System.out.println(b);
        /* 600 into binary decimal
        * 1 0 0 1 0 1 1 0 0 0
        * The binary number 01011000 converts to the decimal (numeric) number 88.
         * */
    }
}