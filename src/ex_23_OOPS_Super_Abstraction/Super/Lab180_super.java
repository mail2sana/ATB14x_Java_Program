package ex_23_OOPS_Super_Abstraction.Super;

public class Lab180_super {
}
class Baseclass {
    Baseclass(){
        System.out.println("Default Constructor-> Parent");
    }
    Baseclass(String Browser){
        System.out.println("Parent Construcor -> Parent");
        this.browser = browser;
    }
    // what is baseclass its a common method
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser() {
        System.out.println("Opening browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open browser" + browserName);
// openBrowser - method overloading
    }

}

class Testcase extends Baseclass{
    // Tescase - child , Baseclasss - parent
    void Testcase() {
    }
        // constructor always be public
        Testcase(){
        // two constructors cannot call either call paremeterized or default constructor
       //     super(); -> DC
            super("Chrome"); // PC
            super.openBrowser(); // Normal T1 NP,NR
            super.openBrowser("chrome"); // Type3 P,NR
            System.out.println(super.getBrowser()); // getters getbrowser returns something String
            super.setBrowser("Firefox"); // setters // setter is void no return so error shown on sout
        }

    }
