import java.util.*;

public class L7C3method2 {
    
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume newline after T
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            sc.nextLine(); // Consume newline after N
            String S = sc.nextLine().toLowerCase();
            if (S.isEmpty()) {
                System.out.println();
                continue;
            }
            Stack<Character> stack1 = new Stack<>();
            Stack<Character> stack2 = new Stack<>();
            boolean usingStack1 = true;
            for (int j = 0; j < N; j++) {
                char ch = S.charAt(j);
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    if (usingStack1) {
                        stack1.push(ch);
                    } else {
                        stack2.push(ch);
                    }
                } else {
                    if (usingStack1) {
                        while (!stack1.isEmpty()) {
                            stack2.push(stack1.pop());
                        }
                        stack2.push(ch);
                    } else {
                        while (!stack2.isEmpty()) {
                            stack1.push(stack2.pop());
                        }
                        stack1.push(ch);
                    }
                    usingStack1 = !usingStack1;
                }
            }
            StringBuilder result = new StringBuilder();
            if (usingStack1) {
                while (!stack1.isEmpty()) {
                    result.append(stack1.pop());
                }
            } else {
                while (!stack2.isEmpty()) {
                    result.append(stack2.pop());
                }
            }
            System.out.println(result.reverse().toString());
        }
        sc.close();
    }
}
