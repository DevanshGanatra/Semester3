import java.util.Scanner;

class MyStack {
    int Top = -1;
    int s[];

    MyStack(int n) {
        s = new int[n];
    }

    void Push(int x) {
        if (Top >= s.length - 1)
            System.out.println("Stack Overflow");
        else {
            Top++;
            s[Top] = x;
        }
    }

    int pop() {
        if (Top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int value = s[Top];
            Top--;
            return value;
        }
    }

    int peep(int i) {
        if (Top - i < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return s[Top - i];
        }
    }

    void change(int i, int x) {
        if (Top - i < 0)
            System.out.println("Stack Underflow");
        else {
            s[Top - i] = x;
        }
    }

    void display() {
        for (int index = 0; index <= Top; index++) {
            System.out.print(s[index] + " ");
        }
        System.out.println();
    }
}

public class L7A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maximum Stack Length you want:");
        int n = sc.nextInt();
        MyStack stack = new MyStack(n);
        boolean loop = true;
        while (loop) {
            System.out.println("Enter 1 to push integer in stack");
            System.out.println("Enter 2 to pop integer in stack");
            System.out.println("Enter 3 to peep integer in stack");
            System.out.println("Enter 4 to change integer in stack");
            System.out.println("Enter 5 to display all integers in stack");
            System.out.println("Enter anything else to exit the program");

            int temp = sc.nextInt();

            switch (temp) {
                case 1:
                    System.out.print("Enter integer to push: ");
                    int x = sc.nextInt();
                    stack.Push(x);
                    break;
                case 2:
                    System.out.println("Popped: " + stack.pop());
                    break;
                case 3:
                    System.out.print("Enter index from top you want to see: ");
                    int i = sc.nextInt();
                    System.out.println("Peep: " + stack.peep(i));
                    break;
                case 4:
                    System.out.print("Enter index from top you want to change: ");
                    int i2 = sc.nextInt();
                    System.out.print("Enter integer to change: ");
                    int x2 = sc.nextInt();
                    stack.change(i2, x2);
                    break;
                case 5:
                    stack.display();
                    break;
                default:
                    loop = false;
                    break;
            }
        }
        sc.close();
    }
}
