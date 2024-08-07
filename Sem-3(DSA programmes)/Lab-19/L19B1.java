import java.util.Arrays;
public class L19B1 {
    public static int[] InsertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i-1,element=arr[i];
            while(j>=0 && arr[j]>element){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=element;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,4,5,1,77,5};
        arr=InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }    
}
