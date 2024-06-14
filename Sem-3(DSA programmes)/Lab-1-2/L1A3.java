import java.util.Scanner;

public class L1A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character");
        char c=sc.next().toLowerCase().charAt(0);
        if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
        System.out.println("Its vowel");
        else
        System.out.println("Its consonent");
    }
}
