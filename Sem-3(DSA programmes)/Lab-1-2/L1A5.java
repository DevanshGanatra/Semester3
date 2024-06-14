import java.util.Scanner;

public class L1A5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No.: ");
        int n=sc.nextInt();
        System.out.println("Its Factorial= "+rec(n));
    }
    public static int rec(int n){
        if(n==1)
        return 1;
        else
        return n*rec(n-1);
    }
}
