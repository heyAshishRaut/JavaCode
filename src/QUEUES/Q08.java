// Implement Queues using Stacks
package QUEUES;

import java.util.Stack;

public class Q08{
    Stack<Integer> s = new Stack<>();
    Stack<Integer> channel = new Stack<>();

    public void add(int val){
        if(s.isEmpty()){
            s.push(val);
        }
        // 1
        else{
            while(!s.isEmpty()){
                channel.push(s.pop());
            }
            // empty
            s.push(val);
            // 2
            while(!channel.isEmpty()){
                s.push(channel.pop());
            }
            // 2 1
        }
    }

    public void display(){
        if(s.isEmpty()){
            return;
        }
        else{
            int top = s.pop();
            System.out.print(top + " ");
            display();
            s.push(top);
        }
    }

    public int pop(){
        return s.pop();
    }

    public int peek(){
        return s.peek();
    }

    public static void main(String[] args){
        Q08 obj = new Q08();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.display();
        System.out.println( );
        System.out.println("pop - " + obj.pop());
        System.out.println("peek - " + obj.peek());
        obj.display();
        System.out.println( );
    }
}
