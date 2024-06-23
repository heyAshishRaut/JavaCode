package STACKS;

public class S02{
    int []A = new int[10];
    int index = 0;

    public void push(int value){
        A[index] = value;
        index++;
    }

    public int peek(){
        if(index == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        int idx = 0;
        while(A[idx] != 0){
            idx++;
        }
        return A[idx - 1];
    }

    public int pop(){
        if(index == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        int idx = 0;
        while(A[idx] != 0){
            idx++;
        }
        int top =  A[idx - 1];
        A[idx - 1] = 0;
        return top;
    }

    public boolean isEmpty(){
        if(A.length == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(index == A.length){
            return true;
        }
        return false;
    }

    public int size(){
        int idx = 0;
        while(A[idx] != 0){
            idx++;
        }
        return idx;
    }

    public int capacity(){
        return A.length;
    }

    public void display(){
        for(int i = 0; i < index; i++){
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        S02 obj = new S02();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);

        obj.display();
    }
}
