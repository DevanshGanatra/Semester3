import java.util.Scanner;

public class L9B2 {
    static class Queue {
        int[] arr;
        int size;
        int rear = -1, front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void addAtFirst(int data) {
            if (isFull()) {
                System.out.println("Queue Overflow");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int deleteAtLast() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public void addAtLast(int data) {
            if (isFull()) {
                System.out.println("Queue Overflow");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int deleteAtFirst() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
            } else {
                int i = front;
                do {
                    System.out.print(arr[i] + " ");
                    i = (i + 1) % size;
                } while (i != (rear + 1) % size);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue kyu = new Queue(5);
        while (true) {
            System.out.println("Enter 1 to insert element in Queue");
            System.out.println("Enter 2 to delete element in Queue");
            System.out.println("Enter 3 to display elements of Queue");
            System.out.println("Enter 4 to Exit Programme");
            int n = sc.nextInt();

            // switch (n) {
            //     case 1:
            //         System.out.println("Enter Integer to insert in Queue");
            //         int n1 = sc.nextInt();
            //         kyu.add(n1);
            //         break;
            //     case 2:
            //         kyu.remove();
            //         break;
            //     case 3:
            //         System.out.println("Queue elements:");
            //         kyu.display();
            //         break;
            //     case 4:
            //         System.out.println("Thanks!!");
            //         sc.close();
            //         return;
            //     default:
            //         System.out.println("Invalid Input");
            //         break;
            // }
        }
    }
}
