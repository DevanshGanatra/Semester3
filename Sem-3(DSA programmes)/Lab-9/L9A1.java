import java.util.Scanner;

class MyQueue {
    int n;
    int front;
    int rear;
    int queue[];

    MyQueue(int n) {
        queue = new int[n];
        front = -1;
        rear = -1;
        this.n=n;
    }

    public void enQueue(int data) {
        if (rear >= n-1)
            System.out.println("Queue Overflow");
        else {
            if(front==-1)
            {
                front++;
            }
            rear++;
            queue[rear] = data;
        }
    }

    public void deQueue() {
        if (front == -1)
            System.out.println("Queue underflow");
        else {
            if (front == rear) {
                System.out.println(queue[front]);
                front = -1;
                rear = -1;
            } else {
                front++;
                System.out.println(queue[front - 1]);
            }
        }
    }

    public void display() {
        if (front == -1)
            System.out.println("Queue is Empty");
        else {
            for (int i = front; i <= rear; i++) {

                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class L9A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue kyu = new MyQueue(5);
        while (true) {
            System.out.println("Enter 1 to insert element in Queue");
            System.out.println("Enter 2 to delete element in Queue");
            System.out.println("Enter 3 to display elements of Queue");
            System.out.println("Enter 4 to Exit Programme");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter Integer to insert in Queue");
                    int n1=sc.nextInt();
                    kyu.enQueue(n1);
                    break;
                case 2:
                kyu.deQueue();
                    break;
                case 3:
                System.out.println();
                kyu.display();
                    break;
                case 4:
                System.out.println("Thanks!!");
                sc.close();
                    return;

                default:
                System.out.println("Invalid Input");
                    break;
            }
        }
    }
}