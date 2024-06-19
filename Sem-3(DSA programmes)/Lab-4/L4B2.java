import java.util.Arrays;
import java.util.Scanner;
public class L4B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size = sc.nextInt(); 
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        // Sort the array
        Arrays.sort(arr);
        // Remove duplicates in sorted array
        int[] temp = new int[size];
        int j = 0;
        // Traverse the sorted array
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        // Add the last element
        temp[j++] = arr[size - 1];
        // Create a new array with the correct size
        int[] arrWithoutDuplicates = new int[j];
        for (int i = 0; i < j; i++) {
            arrWithoutDuplicates[i] = temp[i];
        }
        // Print the new array
        System.out.println("Array after removing duplicates: " + Arrays.toString(arrWithoutDuplicates));
        sc.close();
    }
}
