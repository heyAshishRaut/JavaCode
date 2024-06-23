package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class Q01 {
    public void QueueImplementationUsingCF(){
        Queue<Integer> q = new LinkedList<>();
        // 'Queue' is abstract; cannot be instantiated.
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
//        [1, 2, 3, 4, 5]
//        [2, 3, 4, 5]
    }

    public void printElements(Queue<Integer> q01){
        Queue<Integer> q02 = new LinkedList<>();
        while(!q01.isEmpty()){
            int top = q01.remove();
            System.out.print(top + " ");
            q02.add(top);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q01 obj = new Q01();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

//        obj.QueueImplementationUsingCF();
        obj.printElements(q);

    }
}
