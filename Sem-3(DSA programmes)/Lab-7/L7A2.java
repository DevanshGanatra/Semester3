import java.util.Scanner;
import java.util.Stack;

public class L7A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        if (isMirroredString(str)) {
            System.out.println("The string is in the desired form.");
        } else {
            System.out.println("The string is not in the desired form.");
        }
    }

    public static boolean isMirroredString(String str) {
        Stack<Character> stack = new Stack<>();
        int len = str.length();
        int mid = len / 2;

        // Push the first half of the string onto the stack
        for (int i = 0; i < mid; i++) {
            stack.push(str.charAt(i));
        }

        // If the string length is odd, skip the middle character
        if (len % 2 != 0) {
            mid++;
        }

        // Compare the second half of the string with the stack
        for (int i = mid; i < len; i++) {
            if (stack.isEmpty() || stack.pop() != str.charAt(i)) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
 
