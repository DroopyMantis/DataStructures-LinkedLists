public class MyCircularLinkedList {

    private Node head;

    public MyCircularLinkedList(){
        head = new Node();
        head.next = head;
    }

    public MyCircularLinkedList(String item){
        head = new Node(item);
        head.next = head;
    }

    public void addNode(String n){
        Node x = new Node(n);
        if (head.getNext() == head) {
            head.next = x;
            x.next = head;
        } else {
            Node t = head.getNext();
            while (t.getNext() != head) {
                t = t.getNext();
            }
            t.next = x;
            x.next = head;
        }
    }

    public void printList() {
        System.out.print(head.getName());
        Node t = head;
        while (t.getNext() != head) {
            System.out.print(", " + t.getNext().getName());
            t = t.getNext();
        }
        System.out.println();
    }

    public void insertBefore(int index, String n) {
        int len = 1;
        Node x = new Node(n);
        Node t = head.getNext();
        if(head.getNext() == head){
            len = 0;
        }else {
            while (t.getNext() != head) {
                len++;
                t = t.getNext();
            }
        }
        if (index > len) {
            System.out.println(index + " is not a valid index");
            throw new IndexOutOfBoundsException();
        }
        Node y = head;
        for(int i = 0; i < len; i++){
            y = y.getNext();
        }
        if(index == 0){
            y.next = x;
            x.next = head;
            head = x;
        }else{
            Node z = head;
            for(int i = 0; i < index; i++){
                z = z.getNext();
            }
            Node f = head;
            while(index > 1){
                f = f.getNext();
                index--;
            }
            f.next = x;
            x.next = z;
        }
    }

    public void insertAfter(int index, String n) {
        int len = 1;
        Node x = new Node(n);
        Node t = head.getNext();
        if (head.getNext() == head) {
            len = 0;
        } else {
            while (t.getNext() != head) {
                len++;
                t = t.getNext();
            }
        }
        if (index > len) {
            System.out.println(index + " is not a valid index");
            throw new IndexOutOfBoundsException();
        }
        Node z = head;
        for(int i = 0; i < index; i++){
            z = z.getNext();
        }
        x.next = z.getNext();
        z.next = x;
    }

    public int indexOf(String str) {
        int len = 0;
        Node t = head;
        while (t.getNext() != head) {
            len++;
            t = t.next;
        }
        Node y = head;
        for (int i = 0; i < len; i++) {
            if (y.getName() == str) {
                return i;
            } else {
                y = y.getNext();
            }
        }
        return -1;
    }

    public void removeNodeAt(int index) {
        int len = 0;
        Node t = head;
        while (t.getNext() != head) {
            len++;
            t = t.next;
        }
        if (index > len) {
            System.out.println(index + " is not a valid index");
            throw new IndexOutOfBoundsException();
        }
        Node y = head;
        for (int i = 0; i < index; i++) {
            y = y.getNext();
        }
        if(index == 0){
            Node z = y.getNext();
            y.name = null;
            y.next = null;
            head = z;
            t.next = z;
        }else{
            while(index >= 1){
                t = t.getNext();
                index--;
            }
            t.next = y.getNext();
            y.name = null;
            y.next = null;
        }
    }
}
