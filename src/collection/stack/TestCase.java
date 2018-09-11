package collection.stack;

import java.util.Stack;

public class TestCase {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");

        System.out.println(s.peek());  //返回栈顶

        System.out.println(s.pop());   //弹栈

        System.out.println(s);


    }
}
