class Node{
    int data;
    Node prev;
    Node next;
}
public class DoublyLinkedList {
    int size = 0;
    Node head = null;
    Node tail = null;

    void insert(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            node.prev = temp;
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Node node = new Node();
        node.data = 4;
        node.next = null;
        node.prev = null;
        linkedList.insert(node);
    }

    void display() {
        System.out.println("Doubly linkedlist");
        Node temp = head;
        System.out.println("null<---->");
        while (temp != null) {
            System.out.println(temp.data + "<------>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void delete() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println("deleting node" + temp.data + "from last");
            temp = temp.prev;
            temp.next = null;
        }
    }
}