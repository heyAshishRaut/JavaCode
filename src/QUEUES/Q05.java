// Doubly Ended Queue
package QUEUES;

import java.util.Deque;
import java.util.LinkedList;

public class Q05 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        System.out.println(dq);
        dq.addFirst(-1);
        System.out.println(dq);
        dq.addLast(10);
        dq.addLast(40);
        dq.addLast(50);
        System.out.println(dq);
        dq.removeFirstOccurrence(10);
        System.out.println(dq);
    }
}
