import java.util.*   ;
public class L19A1{
    public static int[] BubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr={0,4,5,1,77,5};
        arr=BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}