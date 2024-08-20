//its WOrst case TIme COmplexity= O(n square)  and Avg Case Time Complexity =O(nLog(n))
//Quick Sort is used where there is memory contraint since it doesnt req any aditional memory like Merge Sort 

import java.util.Arrays;

public class L21B1 {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 5, 89, 2, 7, 20, 56 };
        System.out.println("Before: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
