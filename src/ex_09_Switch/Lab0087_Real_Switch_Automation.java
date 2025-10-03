package ex_09_Switch;

import java.util.Scanner;

public class Lab0087_Real_Switch_Automation {
    public static void main(String[] args) {
        // web automation
        // i will ask the user give me the input from browser which he wants to use to i will start the automation in that browser
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = scanner.next();

        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("-------");
                System.out.println("TC1");
                break;
            case "Edge":
                System.out.println("Starting the chrome");
                // selenium part need to do here
                break;
            case "Firefox":
                System.out.println("Starting the chrome");
                // selenium part need to do here
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }



    }
}
