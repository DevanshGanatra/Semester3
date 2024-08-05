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
}

public class L10A1 {
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
    }
}