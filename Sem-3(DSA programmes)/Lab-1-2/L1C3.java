import java.util.Scanner;

public class L1C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int n = sc.nextInt(),sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum+=j;
            }
        }
        System.out.println("Sum="+sum);
        sc.close();
    }
}
