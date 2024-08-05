import java.util.ArrayList;
import java.util.Collections;

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

    public void append(int data) {
        Node newNode = new Node(data);
        if (First == null) {
            First = newNode;
        } else {
            Node current = First;
            while (current.link != null) {
                current = current.link;
            }
            current.link = newNode;
        }
    }

    public void printList() {
        if (First == null) {
            System.out.println("List is Empty");
        } else {
            Node current = First;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.link;
            }
            System.out.println("null");
        }
    }

    public void sortList() {
        if (First == null) {
            System.out.println("Cannot sort empty LinkedList");
        } else {
            ArrayList<Integer> ar = new ArrayList<>();
            Node current = First;

            while (current != null) {
                ar.add(current.data);
                current = current.link;
            }

            Collections.sort(ar);

            current = First;
            int index = 0;
            while (current != null) {
                current.data = ar.get(index);
                index++;
                current = current.link;
            }
        }
    }
}

public class L12B1 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(4);
        l1.append(7);
        l1.append(8);
        l1.append(2);
        l1.append(1);

        System.out.println("Original List:");
        l1.printList();

        l1.sortList();
        System.out.println("\nSorted List:");
        l1.printList();
    }
}
