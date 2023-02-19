public class MyMainClass {

    public static void main(String[] args){
        System.out.println("This is my doubly linked list implementation");

        MyDoubLinkedList listD = new MyDoubLinkedList("A"); // creates head with name A
        listD.addNode("B"); // appends B
        listD.addNode("C"); // appends C
        listD.printList();
        listD.insertBefore(0, "X"); //inserts X before A
        listD.printList();
        listD.insertAfter(1, "Y"); // inserts Y after A
        listD.printList();
        System.out.println(listD.indexOf("Y")); // returns the index of Y
        listD.removeNodeAt(2); // Removes node at index 2
        listD.printList();

        System.out.println("\nThis is my circular linked list implementation");
        MyCircularLinkedList listC = new MyCircularLinkedList("A"); // creates head with name A
        listC.addNode("B"); // appends B
        listC.addNode("C"); // appends C
        listC.printList();
        listC.insertBefore(0, "X"); //inserts X before A
        listC.printList();
        listC.insertAfter(1, "Y"); // inserts Y after A
        listC.printList();
        System.out.println(listC.indexOf("Y")); // returns the index of Y
        listC.removeNodeAt(2); // Removes node at index 2
        listC.printList();
    }
}
// All methods work for all index's in range or throw an out of bounds exception
