package ex_23_OOPS_Super_Abstraction.Abstraction;

public class Lab189_Multiple_Inheritance {
}

class child implements Father1, Father2{

    @Override
    public void money() {
        System.out.println("Child money!");
    }
}

// interface is incomplete so child money will implement
interface Father1{
   final int a =10;
    void money();
}
interface Father2{
    void money();
}
