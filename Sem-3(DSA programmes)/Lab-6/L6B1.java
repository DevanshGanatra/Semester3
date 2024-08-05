import java.util.Scanner;

public class L6B1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Convert hi=new Convert();
        System.out.println("enter 2 to C to F");
        System.out.println("ENter 1 to F to C");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("Enter celcius:");
            double c=sc.nextDouble();
            hi.CtoF(c);
        }
        else if(n==2){
            System.out.println("Enter fahrenheit:");
            double f=sc.nextDouble();
            hi.CtoF(f);
        }
        else
        {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
class Convert{
    double c;
    double f;
    void FtoC(double f)
    {
        c=(f-32)*(5/9.0);
        System.out.println("in Celcius: "+c);
    }
    void CtoF(double c){
        f=(9*c/5.0)+32;
        System.out.println("in Fahrenheit: "+f);
    }
}
