import java.util.Scanner;

public class L1C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sec");
        int sec = sc.nextInt();
        int hr=0,min=0;
        hr=sec/3600;
        min=(sec-(hr*3600))/60;
        sec=sec-(hr*3600)-(min*60);
        System.out.println(hr+":"+min+":"+sec);
    }
}
