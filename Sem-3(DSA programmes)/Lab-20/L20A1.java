import java.util.Arrays;
public class L20A1 {
    public static int[] SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
           for(int j=i+1;j<arr.length;j++){
            if(arr[min]>arr[j]) min=j;
           }
           if(min!=i){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
           }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,4,5,1,77,5};
        arr=SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }    
}
