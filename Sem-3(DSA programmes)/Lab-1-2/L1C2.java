import java.util.Scanner;

public class L1C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Days");
        int n=sc.nextInt();
        int years=n/365;
        n=n%365;
        int months=n/30;
        n=n%30;
        int weeks=n/7;
        int days=n%7;
        System.out.println(years+":"+months+":"+weeks+":"+days);
        sc.close();
    }
}
