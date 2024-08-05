class LinkedList {
    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node First = null;
    public Node Last = null;

    public void append(int data) {
        Node newNode = new Node(data);
        if (First == null) {
            First = newNode;
            Last = newNode;
            newNode.link = First;  // Point back to itself for circular list
        } else {
            Last.link = newNode;  // Link last node to the new node
            newNode.link = First; // Make new node point to the first node
            Last = newNode;       // Update Last to be the new node
        }
    }

    public void count() {
        if (First == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = First;
        int countTemp = 0;
        while (current != Last) {
            countTemp++;
            current = current.link;
        }
        countTemp++;  // Count the last node
        System.out.println("No. of Nodes present are: " + countTemp);
    }
}

public class L10C1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.count(); // Output: No. of Nodes present are: 8
    }
}
