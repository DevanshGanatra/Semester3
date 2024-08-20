class LinkedList {
    class Node {
        int data;
        Node lptr;
        Node rptr;

        Node(int data) {
            this.data = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    public Node left = null;
    public Node right = null;

    // Method to insert a node at the end of the list
    public void insertNode(int data) {
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

    // Method to delete every alternate node
    public void deleteAlternate() {
        if (left == null || left == right) return; // Nothing to delete if the list is empty or has only one node.
        Node current = left;
        while (current != null && current.rptr != null) {
            Node nodeToDelete = current.rptr; // The node to be deleted
            current.rptr = nodeToDelete.rptr; // Link current node to the next node of the node to be deleted
            if (nodeToDelete.rptr != null) {
                nodeToDelete.rptr.lptr = current; // Link the next node back to the current node
            } else {
                right = current; // Update the right pointer if we deleted the last node
            }
            current = current.rptr; // Move to the next node to continue deletion
        }
    }

    // Method to display the list
    public void display() {
        if (left == null) {
            System.out.println("List is empty.");
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

public class L13B1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding some nodes to the list
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.insertNode(6);

        System.out.println("Original List:");
        list.display();

        // Deleting alternate nodes
        list.deleteAlternate();

        System.out.println("List after deleting alternate nodes:");
        list.display();
    }
}
