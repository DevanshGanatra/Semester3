import java.util.Arrays;
import java.util.Scanner;

public class L4B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        // Sort the array before deletion
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Enter Digit to Delete from arr[]:");
        int n = sc.nextInt();
        // Perform binary search
        int key = Arrays.binarySearch(arr, n);
        if (key >= 0) {
            // Element found, create a new array with one less element
            int[] arr2 = new int[size - 1];
            int i;
            // Copy elements before the key
            for (i = 0; i < key; i++) {
                arr2[i] = arr[i];
            }
            // Copy elements after the key
            for (i = key; i < size - 1; i++) {
                arr2[i] = arr[i + 1];
            }
            // Print the new array
            System.out.println("New array after deletion:");
            for (int j = 0; j < arr2.length; j++) {
                System.out.println("arr[" + j + "] = " + arr2[j]);
            }
        } else {
            System.out.println("Element not found in the array.");
        }  
        sc.close();
    }
}
