package ex_23_OOPS_Super_Abstraction.Super;

public class Lab181_Super {
}
class Father{
    //DC constructor
    Father(){
        System.out.println("DC Constr->Father");
    }
    int gold=100;
    void home(){
        System.out.println("Father Home");
    }
}
class son extends Father{
    son(){
        super();

    }
    void bike(){ } // this is son's property

    void newhome(){
        System.out.println("son home");
        System.out.println(super.gold);
        super.home();
        //if i want to call my own variable then use this keyword
        // if i want to call my Father variable then use super keyword
        this.bike();
    }
}