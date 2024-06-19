import java.util.Arrays;
import java.util.Scanner;

public class L4B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array-1 Size:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter arr1[" + i + "]:");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Array-2 Size:");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter arr2[" + i + "]:");
            arr2[i] = sc.nextInt();
        }
        int[] arr3=new int[size1+size2];
        int j=0;
        for(int i=0;i<size1;i++)
        {
            arr3[j]=arr1[i];
            j++;
        }
        for(int i=0;i<size2;i++)
        {
            arr3[j]=arr2[i];
            j++;
        }
        System.out.println("Resultant array: "+Arrays.toString(arr3));
        sc.close();
    }
}
