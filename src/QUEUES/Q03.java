package QUEUES;

// Queue implementation using LinkedList
public class Q03 {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val){
            Node insert = new Node(val);
            if(head == null){
                head = insert;
            }
            else{
                tail.next = insert;
            }
            tail = insert;
            size++;
        }

        public int remove(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }
            int top =  head.val;
            head = head.next;
            size--;
            return top;
        }

        public int peek(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public boolean isEmpty(){
            if(size == 0){
                return true;
            }
            else{
                return false;
            }
        }

        public int size(){
            return size;
        }

        public void display(){
            Node traverse = head;
            if(traverse == null){
                System.out.println("Queue is empty");
            }
            else{
                while(traverse != null){
                    System.out.print(traverse.val + " ");
                    traverse = traverse.next;
                }
                System.out.println( );
            }
        }
    }
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        obj.display();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.display();
        obj.add(6);
        System.out.println(obj.remove());
        obj.display();
        System.out.println(obj.peek());
        obj.display();
    }
}
