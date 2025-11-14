package ex_25_ENUM;

import org.xml.sax.Locator;

public class Lab200_Enum_Real_WebAutomation {
    public static void main(String[] args){
        System.out.println(Locators.input_Email.getLocator());
    }

}
enum Locators{
    input_Email(" //*{@id]/username\\"),
    input_Password("//*{@id]/password\\"),
    page_button("#btn");

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    private String locator;

            Locators(String locator){
                this.locator = locator;

            }
}
