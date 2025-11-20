package ex_30_Collection_FrameWork.CF_01_LIST;

import java.util.Stack;

public class Lab238_Stack {
    static void main() {
        // stack = Last in First out
        Stack s = new Stack();
        s.add("pramod");
        s.add("dutta");
        s.add(2354);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek()); // give you the top element
        System.out.println(s.pop()); // remove the latest element
        System.out.println(s);
        System.out.println(s.add("snehal"));
        System.out.println(s);
        s.add("pramod");
        s.add("vijay");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));



    }
}
