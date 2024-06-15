import java.util.Scanner;
public class L3B2 {
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
        System.out.println("Enter no. to be replace");
        int n1=sc.nextInt();
        System.out.println("Enter no. to replace:");
        int n2=sc.nextInt();
        boolean found=false;
        for(int i=0;i<size;i++){
            if(arr[i]==n1)
            {
                arr[i]=n2;
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Cant find "+n1+" in the array.");
        }
        else{
            System.out.println("New array:");
            for(int i=0;i<size;i++)
            {
                System.out.println("Enter arr["+i+"] :"+arr[i]);
            }
        }
        sc.close();
    }
}
