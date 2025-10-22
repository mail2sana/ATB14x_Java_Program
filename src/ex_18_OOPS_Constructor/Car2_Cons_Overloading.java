package ex_18_OOPS_Constructor;

public class Car2_Cons_Overloading {
    String model;
    int year;

    Car2_Cons_Overloading(){
        model="xxxx";
        year=1910;
        System.out.println("DC");
    }
    Car2_Cons_Overloading(String model_name , int year_created){
        this("I10"); // Constructor chaining
        this.model = model_name;
        this.year = year_created;
    }
    Car2_Cons_Overloading(String model_name){
       // this.model=model_name;
      //  this();


    }

}
