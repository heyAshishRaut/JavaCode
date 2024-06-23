package STACKS;

public class S03{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class LinkedList{
        Node head = null;
        int size = 0;

        public void push(int val){
            Node insert = new Node(val);
            if(head == null){
                head = insert;
            }
            else{
                insert.next = head;
                head = insert;
            }
            size++;
        }

        public int peek(){
            if(head == null){
                return -1;
            }
            else{
                return head.val;
            }
        }

        public int pop(){
            if(head == null){
                return -1;
            }
            else{
                int top = head.val;
                head = head.next;
                return top;
            }
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }


        public void display(Node head){
            if(head == null){
                return;
            }
            display(head.next);
            System.out.print(head.val + " ");
        }

        public void displayReverse(){
            Node traverse = head;
            while(traverse != null){
                System.out.print(traverse.val + " ");
                traverse = traverse.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);

        obj.displayReverse(); System.out.println( );

        obj.display(obj.head); System.out.println( );
    }
}
