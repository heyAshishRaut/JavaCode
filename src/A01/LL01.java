package A01;

public class LL01 {
    public static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temporary = new Node(val);
            if(head == null){
                head = temporary;
            }
            else{
                tail.next = temporary;
            }
            tail = temporary;
        }

        void insertAtHead(int val){
            Node temporary = new Node(val);
            if(head == null){
                head = tail = temporary;
            }
            else{
                temporary.next = head;
                head = temporary;
            }
        }

        void display(){
            Node temporary = head;
            while(temporary != null){
                System.out.print(temporary.data + "  ");
                temporary = temporary.next;
            }
        }

        int size(){
            System.out.println( );
            Node temporary = head;
            int count = 0;
            while(temporary != null){
                count++;
                temporary = temporary.next;
            }
            return count;
        }

        void insertAt(int idx, int val){
            Node temporary = head;
            for(int i = 1; i < idx; i++){
                temporary = temporary.next;
            }
            Node insert = new Node(val);
            insert.next = temporary.next;
            temporary.next = insert;
        }

        int getElement(int idx){
            Node temporary = head;
            for(int i = 1; i <= idx; i++){
                temporary = temporary.next;
            }
            return temporary.data;
        }

        void deleteAt(int idx){
            Node temporary = head;
            for(int i = 1; i < idx; i++){
                temporary = temporary.next;
            }
            temporary.next = temporary.next.next;
        }

        int nThFromEnd(int lastIdx){
            Node temporary = head;
            int size = size();
            int startIdx = size - lastIdx + 1;
            for(int i = 1; i < startIdx; i++){
                temporary = temporary.next;
            }
            return temporary.data;
        }

        int nThFromEndInOneTraversal(int lastIdx){
            Node slow = head, fast = head;
            for(int i = 1; i <= lastIdx; i++){
                fast = fast.next;
            }
            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }

        void deleteNThFromEndInOneTraversal(int lastIdx){
            Node slow = head, fast = head;
            for(int i = 1; i <= lastIdx; i++){
                fast = fast.next;
            }
            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }

        int calculateSize(Node head){
            int size = 0;
            while(head != null){
                size++;
                head = head.next;
            }
            return size;
        }
        boolean insertionOfLinkedList(Node head01, Node head02){
            int sizeOf01 = calculateSize(head01);
            int sizeOf02 = calculateSize(head02);
            int moveBy;
            Node fast, slow;
            if(sizeOf01 > sizeOf02){
                moveBy = sizeOf01 - sizeOf02;
                fast = head01;
                slow = head02;
            }
            else{
                moveBy = sizeOf02 - sizeOf01;
                fast = head02;
                slow = head01;
            }
            for(int i = 1; i <= moveBy; i++){
                fast = fast.next;
            }
            while(fast != null){
                if(fast == slow){
                    return true;
                }
                fast = fast.next;
                slow = slow.next;
            }
            return false;
        }

        int findMiddleElement(){
            System.out.println( );
            Node slow = head, fast = head;
            while(fast.next != null && fast != null){
                slow =slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }

        void deleteRightIfEvenMiddleElement(){
            Node slow = head, fast = head;
            if(slow.next == null){
                return;
            }
            while(fast.next.next != null && fast.next.next.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }

        boolean checkForCycle(){
            Node slow = head, fast = head;
            if(slow == null || slow.next == null){
                return false;
            }
            while(fast != null){
                if(slow == null || fast.next == null){
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }

        Node cycleBegins(){
            Node slow = head, fast = head;
            while(fast != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    break;
                }
            }
            Node temporary = head;
            while(temporary != slow){
                temporary = temporary.next;
                slow = slow.next;
            }
            return slow;
        }

        void splitIntoTwoForOddAndEven(Node head){
            Node move = head;
            LinkedList odd = new LinkedList();
            odd.insertAtEnd(-1);

            LinkedList even = new LinkedList();
            even.insertAtEnd(0);

            while(move != null){
                if(move.data % 2 == 0){
                    even.insertAtEnd(move.data);
                }
                else{
                    odd.insertAtEnd(move.data);
                }
                move = move.next;
            }
            Node forOdd = odd.head;
            while(forOdd.next != null){
                forOdd = forOdd.next;
            }

            Node forEven = even.head;
            forEven = forEven.next;
            forOdd.next = forEven;
            forOdd = odd.head;
            forOdd = forOdd.next;

            display(forOdd);
        }

        void display(Node head){
            while(head != null){
                System.out.print(head.data + "  ");
                head = head.next;
            }
        }

    }
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
//        obj.insertAtEnd(10);
//        obj.insertAtEnd(20);
//        obj.insertAtEnd(30);
//        obj.insertAtEnd(40);
//        obj.insertAtEnd(50);
//
//        obj.insertAtHead(-1);
//
//        obj.insertAt(3, 100);
//
//        obj.display();
//
//        System.out.println(obj.size());
//
//        System.out.println(obj.getElement(3));
//
//        obj.deleteAt(3);
//
//        obj.display();
//
//        System.out.println(obj.nThFromEnd(2));
//
//        System.out.println(obj.nThFromEndInOneTraversal(2));
//
//        obj.deleteNThFromEndInOneTraversal(2);
//
//        obj.display();
//
//        System.out.println(obj.findMiddleElement());
//
//        obj.deleteRightIfEvenMiddleElement();
//
//        obj.display();

        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(10);
        Node d = new Node(20);
        Node e = new Node(7);
        Node f = new Node(30);
        Node g = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        obj.splitIntoTwoForOddAndEven(a);
    }
}