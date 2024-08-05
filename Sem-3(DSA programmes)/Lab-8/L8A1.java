import java.util.Scanner;
import java.util.Stack;

public class L8A1 {

    public static String convertInfixToPostfix(String str) {
        StringBuilder sb = new StringBuilder(str.trim());
        StringBuilder postFix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        stack.push('(');
        sb.append(')');

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                postFix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (stack.peek() != '(') {
                    postFix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && Stackprecedence(stack.peek()) >= Infixprecedence(ch)) {
                    postFix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        return postFix.toString();
    }

    public static int Stackprecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            default:
                return 0;
        }
    }
    public static int Infixprecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Correct Infix String only! : ");
        String str = sc.nextLine();
        System.out.println("PostFix string: " + convertInfixToPostfix(str));
        sc.close();
    }
}
