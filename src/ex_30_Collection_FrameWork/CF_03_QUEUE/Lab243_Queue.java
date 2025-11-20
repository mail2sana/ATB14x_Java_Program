package ex_30_Collection_FrameWork.CF_03_QUEUE;

import java.util.PriorityQueue;

public class Lab243_Queue {
    // Queue -> 0.001% not use in automation
    // FIFO

    static void main() {
        PriorityQueue q = new PriorityQueue();
        q.add("pramod");
        q.add("Dutta");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);


    }
}
