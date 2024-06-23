package QUEUES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q06{
    public void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        System.out.println("Original Queue - " + q);
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println("Reversed Queue - " + q);
    }

    public void reverseFirstKElements(Queue<Integer> q, int k){
        // 1 2 3 4 5
        // k = 3
        // 3 2 1 4 5
        Stack<Integer> s = new Stack<>();

        System.out.println("Original queue - " + q);

        // 1 2 3 4 5
        for(int i = 0; i < k; i++){
            s.push(q.remove());
        }
        // 4 5
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        // 4 5 3 2 1
        for(int i = 1; i <= q.size() - k; i++){
            q.add(q.remove());
        }
        // 3 2 1 4 5
        System.out.println("After reversing k th elements - " + q);
    }
    public static void main(String[] args){
        Q06 obj = new Q06();

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        obj.reverseQueue(q);

        obj.reverseFirstKElements(q, 3);
    }
}
