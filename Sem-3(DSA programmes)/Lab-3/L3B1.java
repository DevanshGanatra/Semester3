import java.util.Arrays;
import java.util.Scanner;
public class L3B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter arr["+i+"] :");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        boolean conatinsDuplicate=false;
        for(int i=1;i<size;i++)
        {
            if(arr[i]==arr[i-1])
            {
                System.out.println("Contains duplicate");
                conatinsDuplicate=true;
                break;
            }
        }
        if(!conatinsDuplicate){
            System.out.println("Doesn't Contains duplicate");
        }
        sc.close();
    }
}
