import java.util.Stack;

class LinkedList {
    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node first = null;

    public void append(int data) {
        Node newNode = new Node(data);
        if (first == null)
            first = newNode;
        else {
            Node current = first;
            while (current.link != null) {
                current = current.link;
            }
            current.link = newNode;
        }
    }

    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.link;
        }
        System.out.println("null");
    }

    // method-1
    public void reverseLinkList() {
        if (first == null) {
            System.out.println("Cant reverse empty linked list");
        } else {
            Stack<Integer> s1 = new Stack<>();
            Node current = first;
            while (current != null) {
                s1.push(current.data);
                current = current.link;
            }
            current = first;
            while (current != null) {
                current.data = s1.pop();
                current = current.link;
            }
        }
    }

    // method-2
    public void reverseLinkList2() {
        if (first == null) {
            System.out.println("Cannot reverse empty linked list");
        } else {
            Node current = first;
            Node next;
            Node prev = null;
            while (current != null) {
                next = current.link; // Store the next node
                current.link = prev; // Reverse the link
                prev = current; // Move prev forward
                current = next; // Move current forward
            }
            first = prev; // Update the head to the new front
        }
    }

}

public class L12A2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(1);
        list.append(2);
        list.append(3);
        list.printList();
        list.reverseLinkList2();
        list.printList();
    }
}