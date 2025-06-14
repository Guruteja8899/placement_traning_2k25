

public class linkedlist {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        System.out.println("Original Linked List:");
        printList(head);
        
        head = reverseList(head);
        
        System.out.println("Reversed Linked List:");
        printList(head);
    }
    
}
