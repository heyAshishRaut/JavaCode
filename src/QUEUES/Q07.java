// implement Stack using Queue

package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

// Queue - add, remove, peek, isEmpty
// Stack - push, pop, peek, isEmpty

public class Q07 {
    Queue<Integer> q = new LinkedList<>();
    // 1 <- 2 <- 3 <- 3 <- 4 <- 5

    // peek()
    // 5 <- 1 <- 2 <- 3 <- 3 <- 4

    // 1 <- 2 <- 3 <- 3 <- 4 <- 5
    public void add(int val){
        q.add(val);
    }

    public int pop(){
        // 1 2 3 4 5
        for(int i = 1; i <= q.size() - 1; i++){
            q.add(q.remove());
        }
        // 5 1 2 3 4
        return q.remove();
        // 1 2 3 4
    }

    public int peek(){
        for(int i = 1; i <= q.size() - 1; i++){
            q.add(q.remove());
        }
        int top = q.peek();
        q.add(q.remove());
        return top;
    }

    public boolean isEmpty(){
        if(q.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void display(){
        System.out.println(q);
    }

    public static void main(String[] args) {
        /*
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        [1, 2, 3]

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        [1, 2, 3]
        */

        Q07 obj = new Q07();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        obj.display();
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        obj.display();
    }
}
