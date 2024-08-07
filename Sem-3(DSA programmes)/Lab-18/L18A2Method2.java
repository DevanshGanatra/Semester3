public class L18A2Method2 {
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (mid == key)
                return mid;
            else if (key < mid)
                return binarySearch(arr, left, mid - 1, key);
            else
                return binarySearch(arr, mid + 1, right, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7 };
        if (binarySearch(arr, 0, arr.length - 1, 3) != -1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
