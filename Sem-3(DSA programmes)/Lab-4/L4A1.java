import java.util.Scanner;

public class L4A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter position to insert:");
        int pos = sc.nextInt();
        // Convert to 0-based index
        pos--;
        if (pos >= 0 && pos <= size) {
            int[] arr2 = new int[size + 1];
            int i;
            // Copy elements before the insertion point
            for (i = 0; i < pos; i++) {
                arr2[i] = arr[i];
            }
            // Insert the new element
            arr2[i] = n;
            // Copy remaining elements after the insertion point
            for (i = pos + 1; i < size + 1; i++) {
                arr2[i] = arr[i - 1];
            }  
            // Print the new array
            System.out.println("Array after insertion:");
            for (i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
        } else {
            System.out.println("Invalid position. It should be between 1 and " + (size + 1));
        }
        sc.close();
    }
}
