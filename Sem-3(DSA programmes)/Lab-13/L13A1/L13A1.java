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

    public Node first;
    public Node last;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            newNode.link = first;
            last = newNode;
        } else {
            newNode.link = first;
            first = newNode;
            last.link = first;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            newNode.link = first;
            last = newNode;
        } else {
            last.link = newNode;
            newNode.link = first;
            last = newNode;
        }
    }

    public void deleteNode(int data) {
        if (first == null) {
            System.out.println("Cannot delete from an empty LinkedList.");
            return;
        }
        if (first.data == data && first.link == first) {
            first = null;
            last = null;
        } else if (first.data == data) {
            first = first.link;
            last.link = first;
        } else {
            Node current = first;
            while (current.link != first && current.link.data != data) {
                current = current.link;
            }
            if (current.link == first) {
                System.out.println("Node with data " + data + " not found in the LinkedList.");
            } else {
                if (current.link == last) {
                    last = current;
                }
                current.link = current.link.link;
            }
        }
    }

    public void display() {
        if (first == null) {
            System.out.println("The LinkedList is empty.");
        } else {
            Node current = first;
            do {
                System.out.print(current.data + " -> ");
                current = current.link;
            } while (current != first);
            System.out.println("HEAD (" + first.data + ")");
        }
    }
}

public class L13A1 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        boolean willProgContinue = true;

        while (willProgContinue) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.println("3. Delete a Specific Node");
            System.out.println("4. Display LinkedList");
            System.out.println("5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert at the beginning:");
                    int dataFirst = sc.nextInt();
                    l1.insertAtFirst(dataFirst);
                    break;
                case 2:
                    System.out.println("Enter data to insert at the end:");
                    int dataLast = sc.nextInt();
                    l1.insertAtLast(dataLast);
                    break;
                case 3:
                    System.out.println("Enter data of the node to delete:");
                    int dataToDelete = sc.nextInt();
                    l1.deleteNode(dataToDelete);
                    break;
                case 4:
                    l1.display();
                    break;
                case 5:
                    System.out.println("Exiting program. Thank you!");
                    willProgContinue = false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
        sc.close();
    }

    public void addEnd(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addEnd'");
    }
}
