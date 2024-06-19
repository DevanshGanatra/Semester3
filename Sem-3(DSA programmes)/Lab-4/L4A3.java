import java.util.Arrays;
import java.util.Scanner;
public class L4A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter Digit to insert into arr[]:");
        int n = sc.nextInt();
        int[] arr2 = new int[size + 1];
        int i = 0;
        // Copy elements until we find the position for n
        while (i < size && arr[i] <= n) {
            arr2[i] = arr[i];
            i++;
        }
        // Insert the new element
        arr2[i] = n;
        // Copy the remaining elements
        while (i < size) {
            arr2[i + 1] = arr[i];
            i++;
        }
        System.out.println("New array: ");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("arr[" + j + "] = " + arr2[j]);
        }
        sc.close();
    }
}
