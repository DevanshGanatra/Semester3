import java.util.*;
public class L4C1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Word: ");
        String str=sc.nextLine();
        System.out.println("Enter L to convert in lower case Or Enter U to convert in upper case. ");
        char ch=sc.next().toLowerCase().charAt(0);
        if(ch=='l')
        {
            System.out.println(str.toLowerCase());
        }
        else if(ch=='u')
        {
            System.out.println(str.toUpperCase());
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
}
