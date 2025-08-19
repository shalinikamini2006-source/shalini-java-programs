class Node {
    int data; 
    Node next; 
    public Node(int data) {
        this.data = data;
        this.next = null; 
    }
}
public class LinkedList {
    Node head; 

    public LinkedList() {
        this.head = null;
    }
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); 
        newNode.next = head; 
        head = newNode; }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data); 
        if (head == null) { 
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) { 
            current = current.next;
        }
        current.next = newNode; 
    }
    public void deleteNode(int key) {
        Node current = head;
        Node previous = null;
        if (current != null && current.data == key) {
            head = current.next; 
            return;
        }
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        previous.next = current.next;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtEnd(30);

        System.out.print("Linked list after insertions: ");
        list.printList(); 

        list.deleteNode(20);
        System.out.print("Linked list after deleting 20: ");
        list.printList(); 

        list.deleteNode(5);
        System.out.print("Linked list after deleting 5: ");
        list.printList();
    }
}