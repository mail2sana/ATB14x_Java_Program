package ex_05_TypeCasting;

public class Lab0058_Typecasting {
    public static void main(String[] args) {
       //byte b=500; In valid bcoa byte is 1Bit-8Bytes
        int val=500; // is valid int is 4Bit-32Bytes
      //  byte b=val; //--> its narrowing(bigger date to smaller) but it's not valid scn implicit will not happen(system will not coverting)

        byte b=(byte)val; // --> its narrowing but explicit we are forcing system to do a covertion /data loss will be ther

    }
}
