import java.util.*;

public class L21A1 {

    public static void mergeSort(int[] arr) {
        if (arr.length < 2)
            return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                arr[arrayIndex] = left[leftIndex];
                arrayIndex++;
                leftIndex++;
            } else {
                arr[arrayIndex] = right[rightIndex];
                arrayIndex++;
                rightIndex++;
            }
        }
        while (leftIndex < left.length) {
            arr[arrayIndex] = left[leftIndex];
            arrayIndex++;
            leftIndex++;
        }
        while (rightIndex < right.length) {
            arr[arrayIndex] = right[rightIndex];
            arrayIndex++;
            rightIndex++;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,7,8,5,48,98,52};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
