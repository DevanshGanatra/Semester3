import java.util.Scanner;

public class L3A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter arr["+i+"] :");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
