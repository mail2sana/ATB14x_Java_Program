package ex_18_OOPS_Constructor;

public class Lab164_Car {
    public static void main(String[] args) {
        LoginPage l = new LoginPage();
        System.out.println("------------------------");

        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);
    }

}

