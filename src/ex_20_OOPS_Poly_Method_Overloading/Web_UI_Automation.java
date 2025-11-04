package ex_20_OOPS_Poly_Method_Overloading;

public class Web_UI_Automation {
    public static void main(String[] args) {
        Browser b1=new Browser();
        b1.startBrowser();
        b1.startBrowser("chrome");
    }

}

class Browser{
    void startBrowser(){
        System.out.println("Default browser is started");
    }
    void startBrowser(String browser){
        System.out.println("Starting broswer ->" + browser);
    }
}