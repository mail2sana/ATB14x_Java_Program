package ex_25_ENUM;

public class Lab200_Congrats {
    static void main() {
        System.out.println(Environment.Prod.getBaseUrl());
        System.out.println(Environment.Dev.getBaseUrl());
    }
}
enum Environment{
    Dev("https://dev.myapp.com"),
    Staging("https://Stag.myapp.com"),
    Prod("https://myapp.com");

    public String getBaseUrl() {
        return baseUrl;
    }
//Varaible declaration
    private final String baseUrl;

    // parameterized constructor
    Environment(String baseUrl){
        this.baseUrl=baseUrl;
    }
}
