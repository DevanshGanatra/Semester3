import java.util.Scanner;

public class L3A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] arr=new int[size];
        int minpos=0,maxpos=0;
        System.out.println("Enter arr[0]:");
        arr[0]=sc.nextInt();
        int mindigit=arr[0];
        int maxdigit=arr[0];
        for(int i=1;i<size;i++)
        {
            System.out.println("Enter arr["+i+"] :");
            arr[i]=sc.nextInt();
            if(arr[i]<mindigit)
            {
                mindigit=arr[i];
                minpos=i; 
            }
            if(arr[i]>maxdigit)
            {
                maxdigit=arr[i];
                maxpos=i;
            }
        }
        System.out.println("Min pos="+minpos+"& Max pos="+maxpos);
        sc.close();
    }
}
