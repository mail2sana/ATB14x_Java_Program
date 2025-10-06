package ex_10_For_Loop;

public class Lab112_ForLoop_Contiue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i==5){
                continue;
// it will the condition not print that just skip that pass (i==5 -> 5==5) condition rest will continue to print
            }
            System.out.println(i);
// 0,1,2,3,4,6,7,8....49 -> 5 will not print but won't break on 5 just continue to execute the rest part

        }
    }
}
