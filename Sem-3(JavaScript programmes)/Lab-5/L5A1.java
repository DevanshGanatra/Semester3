import java.util.Arrays;
import java.util.Scanner;

public class L5A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[2][2];
        int[][] b=new int[2][2];
        int[][] res=new int[2][2];
        System.out.println("Enter Integer Elements for array-1");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter a["+i+"]: ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Integer Elements for array-2");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter b["+i+"]: ");
                b[i][j]=sc.nextInt();
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Resultant Array :");
        for(int i=0;i<2;i++){
            System.out.println(Arrays.toString(res[i]));
        }
        sc.close();
    }
    
}