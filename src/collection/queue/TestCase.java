package collection.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class TestCase {

    public static void main(String[] args) {

        Queue queue = new LinkedList();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.peek()); //返回队列的头部

        System.out.println(queue.poll());  // 出列

        System.out.println(queue);


    }
}
