import java.util.Scanner;

class MyStack {
    int Top = -1;
    int[] s;

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
    int Pop() {
        if (Top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int x = s[Top];
            Top--;
            return x;
        }
    }
    boolean isEmpty() {
        return Top == -1;
    }
    int size() {
        return Top + 1;
    }
}

public class L7B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string in the form of a^i.b^i: ");
        String str = sc.nextLine().toLowerCase();
        sc.close();

        MyStack stackForA = new MyStack(str.length());

        int i = 0;
        // Push all 'a's onto the stack
        while (i < str.length() && str.charAt(i) == 'a') {
            stackForA.Push(1);
            i++;
        }
        // Check remaining characters to be 'b's
        while (i < str.length() && str.charAt(i) == 'b') {
            if (stackForA.isEmpty()) {
                System.out.println("Number of a should be equal to number of b");
                return;
            }
            stackForA.Pop();
            i++;
        }

        // Final check: stack should be empty, and we should have processed the whole string
        if (stackForA.isEmpty() && i == str.length()) {
            System.out.println("Number of 'a' is equal to number of 'b'.");
        } else {
            System.out.println("Number of 'a' is not equal to number of 'b' or the format is incorrect.");
        }
    }
}
