package A01;

public class DoublyLL {
    public static class Node{
        int val;
        Node next;
        Node previous;
        Node(int val){
            this.val = val;
        }
    }

    public void display(Node head){
        Node traverse = head;
        while(traverse != null){
            System.out.print(traverse.val + "  ");
            traverse = traverse.next;
        }
    }

    public void reverseDisplay(Node tail){
        Node traverse = tail;
        while(traverse != null){
            System.out.print(traverse.val + "  ");
            traverse = traverse.previous;
        }
    }

    public void insertionAtHead(int val, Node head){
        Node insert = new Node(val);
        insert.next = head;
        insert.previous = null;
        head.previous = insert;
        head = insert;
        display(head);
    }

    public void insertionAtTail(int val, Node head){
        Node insert = new Node(val);
        Node traverse = head;
        while(traverse.next != null){
            traverse = traverse.next;
        }
        traverse.next = insert;
        insert.previous = traverse;
        insert.next = null;
        display(head);
    }

    public void insertionAtIndex(int val, int index, Node head){
        Node insert = new Node(val);
        Node traverse = head;
        for(int i = 0; i <= index; i++){
            traverse = traverse.next;
        }
        traverse.next.previous = insert;
        insert.previous = traverse;
        insert.next = traverse.next;
        traverse.next = insert;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.previous = null;
        a.next = b;

        b.previous = a;
        b.next = c;

        c.previous = b;
        c.next = d;

        d.previous = c;
        d.next = e;

        e.previous = d;
        e.next = null;

        DoublyLL obj = new DoublyLL();
        obj.insertionAtTail(-1, a);
    }
}

