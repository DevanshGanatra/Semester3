import java.util.Scanner;

public class L1B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt(),temp=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            temp++;
        }
        if(temp==0)
        System.out.println("Its prime");
        else
        System.out.println("Its Non Prime");
    }
}
