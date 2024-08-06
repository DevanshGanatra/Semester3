public class L18A1{
    public static int LinearSearch(int[] arr,int k){
        for(int i=0;i<arr.length;i++) if(arr[i]==k) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7};
        System.out.println(LinearSearch(arr, 3));;
    }
}