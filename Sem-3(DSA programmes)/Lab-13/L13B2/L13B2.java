class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L13B2 {
    Node head =null;

    // Function to split the list into two halves
    void splitList() {
        if (head == null || head.next == head) {
            return; 
        }
        Node slow = head;
        Node fast = head;
        // Find the middle of the list
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head1 = head;       // First half head
        Node head2 = slow.next;  // Second half head
        // Make the second half circular
        slow.next = head;
        if (fast.next.next == head) {
            fast = fast.next;
        }
        fast.next = head2;
        // Print both halves
        printList(head1, slow);
        printList(head2, fast);
    }

    // Function to print a circular linked list
    void printList(Node start, Node end) {
        Node temp = start;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != start);
        System.out.println();
    }

    // Function to insert a node at the end of the circular linked list
    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public static void main(String[] args) {
        L13B2 list = new L13B2();

        // Creating the circular linked list
        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.addEnd(4);
        list.addEnd(5);

        list.splitList();
    }
}
