package ex_25_ENUM;

public class Lab199_Enum_P3 {
    public static void main(String[] args) {
        System.out.println(Hex_Color.Red.getHexcode());
    }

}
enum Hex_Color{
    Red("#FF0000"),
    Green("#61FF33"),
    Blue("#3377FF");

    public String getHexcode() {
        return hexcode;
    }

    public void setHexcode(String hexcode) {
        this.hexcode = hexcode;
    }

    private String hexcode;
    Hex_Color(String hexcode){
        this.hexcode=hexcode;
    }
}
