package ex_17_OOPS;

public class Lab161_Cat_OOPS {
    public static void main(String[] args) {
        cat c1;
        cat c2;
        cat c3 = new cat();   // one obj -> new cat() , constructor -> cat()
        cat c4 = new cat("Tom");
        cat c5 = new cat("Spicy");

        System.out.println(c3.name);
        System.out.println(c4.name); // both c3 , c4 names are kitty
     // now c4 value will change as Tom

        c5.running();
        c4.running();
    }
}
class cat{
    String name;  // this is attribute -> ALl the attributes of a class are instance variable , int i=10 -> is local variable
    // DC
    cat(){
        name = "Kitty";
    }
    cat(String namepara){    // PC
        this.name=namepara; // this point to c4 , c5
    }

    void drink_milk(){}
    void sleep(){}
    void running(){
        System.out.println("Who is running ->" + this.name);
    }
}