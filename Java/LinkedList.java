// LinkedList
import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    // deletion at end
    public void deleteEnd() {
        if (head == null) return; // List is empty
        if (head.next == null) { // Only one node
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null; // Remove last node
    }
    // deletion at start
    public void deleteStart() { 
        if (head == null) return; // List is empty
        head = head.next; // Move head to next node
    }
    // deletion by key
    public void delete(int key) {
        if (head == null) return; // List is empty
        if (head.data == key) { // Key is at head
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next != null) { // Key found
            current.next = current.next.next; // Bypass the node with the key
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }   
        /* 
        list.insert(24);
        list.insert(31);
        list.delete(24); // Output: 1 2 3
        */
        list.display(); 
        sc.close();
    }  
}