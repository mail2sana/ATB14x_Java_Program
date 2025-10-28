package Ex_Java_Basic_If_Else.Java_24Oct_Exercise;

import java.util.Scanner;

public class Lab24_Website_Domain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Site URL");
        String url = sc.next();

        if(url.endsWith(".com")){
            System.out.println("The website type is: Commercial website ");
        }
        else if (url.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization website ");
        }
        else if (url.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution website ");
        }
        else if (url.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        }
        else if (url.endsWith(".net")) {
            System.out.println("The website type is: Network-related website");
        }
        else if (url.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        }
        else {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
