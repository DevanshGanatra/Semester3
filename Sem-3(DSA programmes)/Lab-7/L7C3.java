import java.util.*;

public class L7C3 {

    class Codechef {
        public static void main(String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            sc.nextLine(); // Consume newline after T
            Stack<Character> tempstack1 = new Stack<>();
            Stack<Character> tempStack2 = new Stack<>();
            boolean usingStack1 = true;
            for (int t = 0; t < T; t++) {
                int N = sc.nextInt();
                sc.nextLine(); // Consume newline after N
                String S = sc.nextLine().toLowerCase();
                if (S.isEmpty()) {
                    System.out.println();
                    continue;
                }

                for (int j = 0; j < N; j++) {
                    char ch = S.charAt(j);
                    if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                        if (usingStack1)
                            tempstack1.push(ch);
                        else
                            tempStack2.push(ch);
                    } else {
                        if (usingStack1) {
                            while (!tempstack1.isEmpty()) {
                                tempStack2.push(tempstack1.pop());
                            }
                            tempStack2.push(ch);
                            usingStack1 = !usingStack1;
                        } else {
                            while (!tempStack2.isEmpty()) {
                                tempstack1.push(tempStack2.pop());
                            }
                            tempstack1.push(ch);
                            usingStack1 = !usingStack1;
                        }
                    }  
                }
                String ans;
                if(usingStack1)
                {
                    StringBuilder res=new StringBuilder();
                    while (!tempstack1.isEmpty()) {
                        char ch=tempstack1.pop();
                        // System.out.print(ch);
                        res.append(ch);
                    }
                     ans=res.reverse().toString();
                }
                else{
                    StringBuilder res=new StringBuilder();
                    while (!tempStack2.isEmpty()) {
                        char ch=tempStack2.pop();
                        // System.out.print(ch);
                        res.append(ch);
                    }
                     ans=res.reverse().toString();
                }
                System.out.println(ans);    
            }
            sc.close();
        }
    }
}