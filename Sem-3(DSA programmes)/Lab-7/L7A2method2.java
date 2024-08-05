import java.util.Scanner;
import java.util.Stack;

public class L7A2method2 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch;
        char[] strArr = new char[str.length()];
        Stack<Character> stack = new Stack<>();
        stack.push('c');
        int i;
        for ( i = 0; (strArr[i] != 'c'); i++) {
            if (strArr[i] == ' ') {
                System.out.println("Invalid String ");
                return;
            }
            stack.push(strArr[i]);
        }
        i++;
        while (stack.peek()!='c') {
            if(strArr[i]!=stack.pop())
            {System.out.println("Invalid String");}
            i++;
        }
        if(strArr[i+1]==' '){
            System.out.println("Valid String ");
        }
        else{
            System.out.println("Invalid String: ");
        }
    }
}
