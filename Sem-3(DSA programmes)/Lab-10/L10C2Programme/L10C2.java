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

    public void isBothLinkedListSame(LinkedList l1) {
        if (l1.first == null || this.first == null) {
            System.out.println("One of the linked lists is empty");
        } else {
            Node current = l1.first;
            Node thisCurrent = this.first;
            while (current != null && thisCurrent != null) {
                if (current.data != thisCurrent.data) {
                    System.out.println("Not Same");
                    return;
                }
                current = current.link;
                thisCurrent = thisCurrent.link;
            }
            // If both lists have ended at the same time, they are same, otherwise not
            if (current == null && thisCurrent == null) {
                System.out.println("Both are same");
            } else {
                System.out.println("Not Same");
            }
        }
    }
    
}

public class L10C2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.printList();
 
        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(2);
        list2.append(3);
        list2.printList();

        list.isBothLinkedListSame(list2);

    }
}