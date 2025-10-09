package ex_15_StringBuilder_StringBuffer_Funct;

public class Lab145_SBuffer {
    public static void main(String[] args) {
        // String buffer
        StringBuffer sbf=new StringBuffer("pramod"); // pramod string

        //append
       sbf.append("Dutta"); // dutta string
        System.out.println(sbf); // how many strings there in jvm -> one string PramodDutta will be there bcoz its BF first one will delete

// I string tell me how many strings will be there
        String s1="Pramod"; // pramod
        s1=s1+"Dutta"; // dutta
        System.out.println(s1); // in jvm 2 string will be there
    }
}
