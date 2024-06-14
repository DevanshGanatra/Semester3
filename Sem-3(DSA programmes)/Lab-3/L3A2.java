import java.util.Scanner;

public class L3A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.-1: ");
        int m = sc.nextInt();
        System.out.println("Enter no.-2: ");
        int n = sc.nextInt();
        if (n >=m) {
            int sum = 0;
            for (int i = m; m <= n; i++) {
                sum += m;
                m++;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
