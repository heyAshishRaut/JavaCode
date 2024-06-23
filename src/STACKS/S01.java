package STACKS;

import java.util.Stack;

public class S01{
    public void copyStack(Stack<Integer> s){
        Stack<Integer> channel = new Stack<>();
        Stack<Integer> copyStack = new Stack<>();

        while(!s.isEmpty()){
            channel.push(s.pop());
        }
        while(!channel.isEmpty()){
            copyStack.push(channel.pop());
        }
        System.out.println(copyStack);
    }

    public void insertionInStack(Stack<Integer> s, int index, int value){
        Stack<Integer> channel = new Stack<>();
        if(index > s.size()){
            System.out.println("Invalid");
            return;
        }
        while(s.size() > index){
            channel.push(s.pop());
        }
        s.push(value);
        while(!channel.isEmpty()){
            s.push(channel.pop());
        }
        System.out.println(s);
    }

    public void displayReverseRecursion(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        System.out.print(top + " ");
        displayReverseRecursion(s);
        s.push(top);
    }

    public void displayRecursion(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        displayRecursion(s);
        System.out.print(top + " ");
        s.push(top);
    }

    public void pushAtBottomRecursion(Stack<Integer> s, int value){
        if(s.isEmpty()){
            s.push(value);
            return;
        }
        int top = s.pop();
        pushAtBottomRecursion(s, value);
        s.push(top);
    }

    public void RemoveFromBottom(Stack<Integer> s){
        Stack<Integer> channel = new Stack<>();
        while(s.size() > 1){
            channel.push(s.pop());
        }
        s.pop();
        while(!channel.isEmpty()){
            s.push(channel.pop());
        }
    }

    public void reverseStack(Stack<Integer> s){
        if(s.size() == 1){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottomRecursion(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        S01 obj = new S01();

//        obj.copyStack(s);

//        obj.insertionInStack(s, 2, 9);

//        obj.displayRecursion(s);
//        System.out.println( );

//        obj.pushAtBottomRecursion(s, -1);

//        obj.RemoveFromBottom(s);

        obj.reverseStack(s);

        System.out.println(s);
    }
}
