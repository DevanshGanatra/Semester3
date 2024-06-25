import java.util.Scanner;

public class L4C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter arr[0]: ");
        arr[0] = sc.nextInt();
        int min = arr[0], max = arr[0],sum=arr[0];
        for (int i = 1; i < size; i++) {
            System.out.println("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
            if(min<arr[i])
            min=arr[i];
            if(max>arr[i])
            max=arr[i];
            sum+=arr[i];
        }
        System.out.println("Enter 1 to find Sum");
        System.out.println("Enter 2 to find MAx");
        System.out.println("Enter 3 to find Min");
        System.out.println("Enter 4 to find Avg");
        int n=sc.nextInt();
        sc.close();
        switch (n) {
            case 1:
                System.out.println("Sum = "+sum);
                break;
            case 2:
                System.out.println("MAx = "+max);
                break;    
            case 3:
                System.out.println("Min = "+min);
                break;
            case 4:
                System.out.println("Avg = "+((sum)/(size*1.0) ));    
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
