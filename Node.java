public class Node {
    public String name;
    public Node next;
    public Node prev;

    public Node(){
        name = null;
        prev = null;
        next = null;
    }

    public Node(String item){
        name = item;
        prev = null;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public String getName(){
        return name;
    }
}
