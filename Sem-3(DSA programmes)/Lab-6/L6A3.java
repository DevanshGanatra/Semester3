import java.util.Scanner;

public class L6A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student_Detail [] emp=new Student_Detail[5];
        for(int i=0;i<5;i++){
            emp[i]=new Student_Detail();
        }
        for(int i=0;i<5;i++){
            emp[i].setData();
        }
        for(int i=0;i<5;i++){
            emp[i].getData();
        }
        sc.close();
    }
}
class Student_Detail{
    Scanner sc=new Scanner(System.in);
    int Enrollment_no;
    String name;
    int semester;
    double cpi;

     public void setData()
    {
        System.out.println("Enter Name: ");
        this.name=sc.nextLine();
        System.out.println("Enter Enrollment no: ");
        this.Enrollment_no=sc.nextInt();
        System.out.println("Enter semester: ");
        this.semester=sc.nextInt();
        System.out.println("Enter CPI:");
        this.cpi=sc.nextDouble();
        sc.nextLine();
    }
    public void getData(){
        System.out.println("name: "+this.name);
        System.out.println("Enrollment No: "+this.Enrollment_no);
        System.out.println("semester: "+this.semester);
        System.out.println("CPI: "+this.cpi);
    }
}