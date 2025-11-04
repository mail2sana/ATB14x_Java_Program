package ex_21_OOPS_Encapsulation;

public class Lab189_Encap_Demo {
    public static void main(String[] args) {
        VWOLogin login = new VWOLogin("admin" , "12345");
        System.out.println(login.PWD);
        // changing the pwd -> this is not restricting so use -> Data hiding method
        login.PWD = "345";
        System.out.println(login.PWD);

        GoodVwoLogin l1 = new GoodVwoLogin("admin" , "1256");
       // System.out.println(l1.pwd);
        String pass = l1.getPwd();
        System.out.println(pass);
l1.setPwd("pass@156", false);


     //   String setpass = l1.setPwd



    }
}
class VWOLogin{
    String UN;
    String PWD;

    public VWOLogin(String UN , String PWD){
        this.PWD = PWD;
        this.UN = UN;
    }
}
class GoodVwoLogin{
    public String getPwd() {
        return pwd;
    }

   public void setPwd(String pwd , boolean isGoodAdmin) {
        if (isGoodAdmin){
            this.pwd = pwd;
        } else {
            System.out.println("Not allowed");
        }
    }


    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    // instance variable, data variable, attribute, fields, properties, member
    private String un;
    private String pwd;

    GoodVwoLogin(String un, String pwd){
        this.pwd=pwd;
        this.un =un;
    }
}