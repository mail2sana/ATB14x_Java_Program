package ex_24_Static;

public class Lab195_Real {
}
class ATB14X{
    {
        System.out.println("IIB - this is called when object is created!");
    }

    static {
        System.out.println("Load the class?, i will execute");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocument(){
        System.out.println("Non static method");
        System.out.println(courseName);
    }
    static void do_assignment(){
      //  System.out.println(phone); // static
        System.out.println("Do Assignment");

    }

    private String name; // non static
    private String phone;

    static String courseName="ATB14x";

}
