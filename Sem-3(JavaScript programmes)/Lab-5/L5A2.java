import java.util.Arrays;
import java.util.Scanner;

public class L5A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a=new int[3][2];
        int [][] b=new int[2][3];
        int [][] mul=new int[3][3];
        System.out.println("Enter Integer Elements for array-1");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter a["+i+"]["+j+"]:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Integer Elements for array-2");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter b["+i+"]["+j+"]:");
                b[i][j]=sc.nextInt();
            }
        }
        //main logic
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0; k<2 ;k++){// K will go upto first's column (here-2)
                    sum+=a[i][k]*b[k][j];
                }
                mul[i][j]=sum;
                sum=0;
            }
        }
        System.out.println("Multiplication matrix will be:");
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(mul[i]));
        }
        sc.close();
    }
}
