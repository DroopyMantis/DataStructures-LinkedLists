public class MyDoubLinkedList {

    private Node head;

    public MyDoubLinkedList() {
        head = new Node();
    }

    public MyDoubLinkedList(String item) {
        head = new Node(item);
    }

    public void addNode(String n) {
        Node x = new Node(n);
        if (head.getNext() == null) {
            head.next = x;
            x.next = null;
            x.prev = head;
        } else {
            Node t = head.getNext();
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.next = x;
            x.prev = t;
            x.next = null;
        }
    }

    public void printList() {
        System.out.print(head.getName());
        Node t = head;
        while (t.getNext() != null) {
            System.out.print(", " + t.getNext().getName());
            t = t.getNext();
        }
        System.out.println();
    }

    public void insertBefore(int index, String n) {
        int len = 0;
        Node x = new Node(n);
        Node t = head;
        while (t.getNext() != null) {
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
        if (index > 0) {
            x.prev = y.getPrev();
            y.getPrev().next = x;
        }
        y.prev = x;
        x.next = y;
        head = x;
    }

    public void insertAfter(int index, String n) {
        int len = 0;
        Node x = new Node(n);
        Node t = head;
        while (t.getNext() != null) {
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
        x.next = y.getNext();
        x.prev = y;
        y.getNext().prev = x;
        y.next = x;
    }

    public int indexOf(String str) {
        int len = 0;
        Node t = head;
        while (t.getNext() != null) {
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
        while (t.getNext() != null) {
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
            z.prev = null;
            y.name = null;
            y.next = null;
            y.prev = null;
            head = z;
        }else{
            y.getNext().prev = y.getPrev();
            y.getPrev().next = y.getNext();
            y.name = null;
            y.next = null;
            y.prev = null;
        }
    }
}



