package STACKS;

import java.util.Stack;

public class S05{
    public void copyStack(Stack<Integer> s){
        Stack<Integer> channel = new Stack<>();
        Stack<Integer> copyStack = new Stack<>();

        System.out.println("Original stack - " + s);

        while(!s.isEmpty()){
            channel.push(s.pop());
        }

        while(!channel.isEmpty()){
            copyStack.push(channel.pop());
        }

        System.out.println("copyStack - " + copyStack);
    }

    public void insertionInStack(Stack<Integer> s, int index, int value){
        System.out.println("Original stack - " + s);

        if(index > s.size()){
            System.out.println("Invalid index");
            return;
        }
        Stack<Integer> temporary = new Stack<>();
        while(s.size() > index){
            temporary.push(s.pop());
        }
        s.push(value);
        while(!temporary.isEmpty()){
            s.push(temporary.pop());
        }
        System.out.println("Updated stack - " + s);
    }

    public void display(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        display(s);
        System.out.print(top + " ");
        s.push(top);
    }

    public void displayReverse(Stack<Integer> s){
        Stack<Integer> cloneStack = (Stack<Integer>) s.clone();
        while(!cloneStack.isEmpty()){
            System.out.print(cloneStack.pop() + " ");
        }
    }

    public void pushAtBottom(Stack<Integer> s, int value){
        if(s.isEmpty()){
            s.push(value);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, value);
        s.push(top);
    }

    public void removeFromBottom(Stack<Integer> s){
        if(s.size() == 1){
            s.pop();
            return;
        }
        int top = s.pop();
        removeFromBottom(s);
        s.push(top);
    }

    public void reverseStack(Stack<Integer> s){
        if(s.size() == 1){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public boolean brackets(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else if(s.peek() == '('){
                    s.pop();
                }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public void reverseString(String str){
        System.out.println("Original string - " + str);
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }
        str = "";
        while(!s.isEmpty()){
            str = str + s.pop();
        }
        System.out.println("Reverse string - " + str);
    }

    public static void main(String[] args){
        S05 obj = new S05();

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

//        obj.copyStack(s);

//        obj.insertionInStack(s, 2, 100);

//        obj.displayReverse(s);

//        obj.pushAtBottom(s, 100);
//        System.out.println(s);

//        obj.removeFromBottom(s);
//        System.out.println(s);

//        System.out.println("Original stack - " + s);
//        obj.reverseStack(s);
//        System.out.println("Reverse stack - " + s);

//        String str01 = "(()()(()))";
//        System.out.println("Answer - " + obj.brackets(str01));

        String str02 = "DANCE";
        obj.reverseString(str02);
    }
}
