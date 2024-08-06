public class L18A2 {
    public static int BinarySearch(int[] arr, int k) {
        int left = 0, right = arr.length - 1, n = arr.length;
        while (left <= right) {
            int mid = left + (n - 1) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
