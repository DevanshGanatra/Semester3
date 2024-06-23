import java.util.Arrays;
import java.util.Scanner;

public class L3C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        sc.nextLine();//to solve JAGJANIT problem
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arr[" + i +"] :");
            arr[i] = sc.nextLine();
        }
        System.out.println("Sorted Array :");
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            System.out.println(" arr[" + i + "] :"+arr[i]);
        }
        sc.close();
    }
}
