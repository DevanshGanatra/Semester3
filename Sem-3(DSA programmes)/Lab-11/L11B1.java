import java.util.Scanner;

public class L11B1 {
        static class Queue {
            static class Node {
                int data;
                Node link;

                Node(int data) {
                    this.data = data;
                    this.link = null;
                }
            }

            private Node first = null;
            private Node last = null;

            // Check if the queue is empty
            public boolean isEmpty() {
                return first == null;
            }

            // Enqueue (add element to the queue)
            public void add(int data) {
                Node newNode = new Node(data);
                if (last == null) { // Queue is empty
                    first = last = newNode;
                } else {
                    last.link = newNode;
                    last = newNode;
                }
                System.out.println(data + " added to the queue.");
            }

            // Dequeue (remove element from the queue)
            public int remove() {
                if (isEmpty()) {
                    System.out.println("Queue Underflow - No elements to remove.");
                    return -1;
                }
                int front = first.data;
                first = first.link;
                if (first == null) { // Queue becomes empty after removal
                    last = null;
                }
                System.out.println(front + " removed from the queue.");
                return front;
            }

            // Display all elements in the queue
            public void display() {
                if (isEmpty()) {
                    System.out.println("The queue is empty.");
                    return;
                }
                System.out.print("Queue elements: ");
                Node current = first;
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.link;
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Queue queue = new Queue();

            while (true) {
                System.out.println("\nQueue Operations Menu:");
                System.out.println("1. Insert element into the queue");
                System.out.println("2. Remove element from the queue");
                System.out.println("3. Display elements of the queue");
                System.out.println("4. Exit the program");
                System.out.print("Select an option (1-4): ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter an integer to insert into the queue: ");
                        int n1 = sc.nextInt();
                        queue.add(n1);
                        break;
                    case 2:
                        queue.remove();
                        break;
                    case 3:
                        queue.display();
                        break;
                    case 4:
                        System.out.println("Thank you! Exiting the program.");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid input. Please select a valid option.");
                        break;
                }
            }
        }

    
}
