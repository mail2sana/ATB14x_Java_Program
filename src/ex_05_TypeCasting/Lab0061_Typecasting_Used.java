package ex_05_TypeCasting;

public class Lab0061_Typecasting_Used {
    public static void main(String[] args) {
        int course=100;
        float gst=18.45f;
     //   int total=course+gst;  narrowing implicit
        int total = course+(int)gst; //narrowing explicit
        System.out.println(total);
        float total1 =course+gst; //widenning auto implicit when choose bigger bucket auto
      //  float total2 =(float)course+gst; widening explicit
        System.out.println(total1);
    }
}
