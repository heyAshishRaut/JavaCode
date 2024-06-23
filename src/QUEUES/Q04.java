package QUEUES;

// Queue implementation using CircularArray
public class Q04 {
    int front = -1, rear = -1;
    int size = 0;
    int []A = new int[5];

    public void add(int val) throws Exception{
        if(size == A.length){
            throw new Exception("Queue is full");
        }
        else if(size == 0){
            front = rear = 0;
            A[rear] = val;
        }
        else if(rear < A.length - 1){ // normal case
            A[++rear] = val;
        }
        else if(rear == A.length - 1){
            rear = 0;
            A[rear] = val;
        }
        size++;
    }

    public int remove() throws Exception{
        if(size == 0){
            throw new Exception("Queue is Empty");
        }
        else{
            int val = A[front];
            if(front == A.length - 1){
                front = 0;
            }
            else{
                front++;
            }
            size--;
            return val;
        }
    }

    public int peek() throws Exception{
        if(size == 0){
            throw new Exception("Queue is Empty");
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
            return;
        }
        else if(front <= rear){
            for(int i = front; i <= rear; i++){
                System.out.print(A[i] + " ");
            }
        }
        else{ // rear < front
            for(int i = front; i < A.length; i++){
                System.out.print(A[i] + " ");
            }
            for(int i = 0; i <= rear; i++){
                System.out.print(A[i] + " ");
            }
        }
        System.out.println( );
    }

    public static void main(String[] args) throws Exception {
        Q04 obj = new Q04();

        obj.display();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.display();
        obj.remove();
        obj.display();
        obj.remove();
        obj.remove();
        System.out.println(obj.peek());
        obj.add(6);
        obj.add(7);
        obj.display();

    }
}
