import java.util.*;

class Dll{

    // insert at beginning
    public static Node insertAtBeginning(Node head, int data){
        Node nn = new Node(data);
        if(head == null)
            return nn;
        else{
            nn.next = head;
            head.prev = nn;
            return nn;
        }
    }
    // insert at end
    public static Node insertAtEnd(Node head, int data){
        Node nn = new Node(data);
        if(head == null)
            return nn;
        else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nn;
            nn.prev = current;
            return head;
        }
    }
    // Display
    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        // Insert at beginning
        System.out.print("Enter data to insert at beginning: ");
        int data1 = sc.nextInt();
        head = insertAtBeginning(head, data1);
        display(head);

        // Insert at end
        System.out.print("Enter data to insert at end: ");
        int data2 = sc.nextInt();
        head = insertAtEnd(head, data2);
        display(head);

        sc.close();
    }
}
class Node{
    int data;
    Node next; 
    Node prev;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}