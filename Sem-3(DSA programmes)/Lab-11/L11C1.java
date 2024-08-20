import java.util.HashSet;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class L11C1 {
    public static Node head = null;

    static public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.link != null) {
                current = current.link;
            }
            current.link = newNode;
        }
    }

    static public void removeDuplicates() {
        if (head == null) {
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (set.contains(current.data)) {
                prev.link = current.link; 
            } else {
                set.add(current.data);
                prev = current;
            }
            current = current.link;
        }
    }

    // Function to print the linked list
    static public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        add(10);
        add(12);
        add(11);
        add(12);
        add(11);
        add(10);

        System.out.println("Original list:");
        printList();

        removeDuplicates();

        System.out.println("List after removing duplicates:");
        printList();
    }
}
