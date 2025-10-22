package ex_18_OOPS_Constructor;

public class Lab162_OOPS {
    public static void main(String[] args) {
        Baby b1= new Baby();
        new Baby();
        new Baby();
        Baby B2;


    }
}

class Baby{
    String name;

    Baby(){
        System.out.println("I am called, object is created");
    }
}
