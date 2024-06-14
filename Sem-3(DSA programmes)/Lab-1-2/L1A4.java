import java.util.Scanner;

public class L1A4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter no.:");
        int n=sc.nextInt(),sum=1;
        while(n>0){
            sum*=n;
            n--;
        }
        System.out.println("Its factorial= "+sum);
    }
}
