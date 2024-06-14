import java.util.Scanner;

public class L3A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        double avg=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        avg=sum/(n*1.0);
        System.out.println(avg);
    }
}
