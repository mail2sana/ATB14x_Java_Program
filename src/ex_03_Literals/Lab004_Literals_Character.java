package ex_03_Literals;

public class Lab004_Literals_Character {
    public static void main(String[] args) {
       char c='A'; // character a-z, A-Z, special symbols !@#$%#^&*()_+
       // char c1="A";  is this character no this is string comes undr double qutation
    char c2 ='b';
    char c3 ='@';
    char c4 ='9';
    char c5 ='_';
    char c6 = ' '; // blank space
        // Escape char
        char new_line = '\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return = '\r';
        System.out.println("sangeethanatarajan");
        System.out.println("sangi\nnata");
        System.out.println("sangeetha"+new_line+"natarajan");
        System.out.println("sangeetha"+back_space+"natarajan");
        System.out.println("_______----------");
//what ever character you are taking basically saving in ASCII format , (limited numbers) A->65
        char rupees='₹';
        System.out.println(rupees);

        char laugh_smiley='\u1f60';
        System.out.println(laugh_smiley);


    }
}
