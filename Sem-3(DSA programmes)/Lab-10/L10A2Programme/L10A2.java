import java.util.Scanner;

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

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null)
            first = newNode;
        else {
            newNode.link = first;
            first = newNode;
        }
    }

    public void displayNodes() {
        Node current = first;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.link;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (first == null) {
            System.out.println("List Underflow: Cannot delete from an empty list");
            return;
        } else {
            first = first.link;
        }
    }

    public void deleteAtLast() {
        if (first == null) {
            System.out.println("List Underflow: Cannot delete from an empty list");
            return;
        } else if (first.link == null) {
            first = null;
        } else {
            Node current = first;
            while (current.link.link != null) {
                current = current.link;
            }
            current.link = null;
        }
    }

    public void insertAtLast(int data) {
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

    public void deleteFromSpecificPos(int pos) {
        if (first == null) {
            System.out.println("List Underflow: Cannot delete from an empty list");
            return;
        } else if (pos == 1)
            first = null;
        else {
            int count = 1;
            Node current = first;
            while (count < pos - 1 && current != null) {
                current = current.link;
                count++;
            }
            if (current == null || current.link == null)
                System.out.println("Invalid Position: " + pos);
            else
                current.link = current.link.link;
        }
    }
}

public class L10A2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        boolean loopMoving = true;

        while (loopMoving) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Insert a node at the front of the linked list");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete the first node of the linked list");
            System.out.println("4. Insert a node at the end of the linked list");
            System.out.println("5. Delete the last node of the linked list");
            System.out.println("6. Delete a node from a specified position");
            System.out.println("7. Exit (Thank You)");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert at the front:");
                    int data1 = sc.nextInt();
                    list.insertAtFirst(data1);
                    System.out.print("List after inserting at first: ");
                    list.displayNodes();
                    break;
                case 2:
                    System.out.print("List: ");
                    list.displayNodes();
                    break;
                case 3:
                    list.deleteFirst();
                    System.out.print("List after deleting first: ");
                    list.displayNodes();
                    break;
                case 4:
                    System.out.println("Enter data to insert at the end:");
                    int data2 = sc.nextInt();
                    list.insertAtLast(data2);
                    System.out.print("List after inserting at last: ");
                    list.displayNodes();
                    break;
                case 5:
                    list.deleteAtLast();
                    System.out.print("List after deleting last: ");
                    list.displayNodes();
                    break;
                case 6:
                    System.out.println("Enter position to delete:");
                    int pos = sc.nextInt();
                    list.deleteFromSpecificPos(pos);
                    System.out.print("List after deleting the given position: ");
                    list.displayNodes();
                    break;
                case 7:
                    loopMoving = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }

        System.out.println("Exiting program. Thank you!");
        sc.close();
    }
}
