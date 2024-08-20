import java.util.Scanner;

class Node {
    int data;
    Node rptr; // Right pointer (next node)
    Node lptr; // Left pointer (previous node)

    Node(int data) {
        this.data = data;
        this.rptr = null;
        this.lptr = null;
    }
}


class MyDoublyLinkedList{
    private Node left = null; // Head of the list
    private Node right = null; // Tail of the list

    // Insert a node at the front of the list
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (left == null) {
            left = newNode;
            right = newNode;
        } else {
            newNode.rptr = left;
            left.lptr = newNode;
            left = newNode;
        }
    }

    // Insert a node at the end of the list
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (right == null) {
            left = newNode;
            right = newNode;
        } else {
            right.rptr = newNode;
            newNode.lptr = right;
            right = newNode;
        }
    }

    // Delete a node from a specified position
    public void deleteAtSpecificPos(int position) {
        if (left == null) {
            System.out.println("Cannot delete from an empty Doubly LinkedList.");
            return;
        }
        Node current = left;
        int pos = 0;
        while (current != null && pos < position) {
            current = current.rptr;
            pos++;
        }
        if (current == null) {
            System.out.println("Node at the given position doesn't exist.");
            return;
        }
        if (current == left) {
            left = left.rptr;
            if (left != null) {
                left.lptr = null;
            } else {
                right = null; // List is now empty
            }
        } else if (current == right) {
            right = right.lptr;
            if (right != null) {
                right.rptr = null;
            } else {
                left = null; // List is now empty
            }
        } else {
            current.lptr.rptr = current.rptr;
            if (current.rptr != null) {
                current.rptr.lptr = current.lptr;
            }
        }
    }

    // Display all nodes in the list
    public void display() {
        if (left == null) {
            System.out.println("Empty Doubly LinkedList.");
        } else {
            Node current = left;
            while (current != null) {
                System.out.print(current.data + " <-> ");
                current = current.rptr;
            }
            System.out.println("null");
        }
    }
}



    public class L13A2 {
    public static void main(String[] args) {
       MyDoublyLinkedList l1=new MyDoublyLinkedList(); 
        Scanner sc = new Scanner(System.in);
        boolean willProgContinue = true;

        while (willProgContinue) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a node at the front");
            System.out.println("2. Insert a node at the end");
            System.out.println("3. Delete a node from a specified position");
            System.out.println("4. Display all nodes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the front: ");
                    int dataFront = sc.nextInt();
                    l1.insertAtFirst(dataFront);
                    break;
                case 2:
                    System.out.print("Enter data to insert at the end: ");
                    int dataEnd = sc.nextInt();
                    l1.insertAtLast(dataEnd);
                    break;
                case 3:
                    System.out.print("Enter the position of the node to delete: ");
                    int position = sc.nextInt();
                    l1.deleteAtSpecificPos(position);
                    break;
                case 4:
                    System.out.println("Displaying all nodes:");
                    l1.display();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    willProgContinue = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
