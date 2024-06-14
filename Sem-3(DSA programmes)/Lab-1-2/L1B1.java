import java.util.Scanner;

public class L1B1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no.");
       int n=sc.nextInt();
       System.out.println("Enter Power: ");
       int pow=sc.nextInt(),sum=1;
       for(int i=1;i<=pow;i++){
            sum*=n;
       } 
       System.out.println("ans= "+sum);
    }
}
