package QUEUES;

// Queue implementation using Array
public class Q02 {
    int size = 0;
    int []A = new int[5];
    int front = -1, rear = -1;

    public void add(int val){
        if(rear == A.length - 1){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
            rear = 0;
            A[rear] = val;
        }
        else{
            A[++rear] = val;
        }
        size++;
    }

    public int remove(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        front++;
        size--;
        return A[front - 1];
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return A[front];
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void display(){
        if(size == 0){
            System.out.println("Queue is empty");
        }
        else{
            for(int i = front; i <= rear; i++){
                System.out.print(A[i] + " ");
            }
            System.out.println( );
        }
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        Q02 obj = new Q02();

        obj.display();
        obj.add(1);
        obj.add(2);
        obj.display();
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.display();
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());

    }
}
