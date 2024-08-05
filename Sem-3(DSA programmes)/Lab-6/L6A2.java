import java.util.Scanner;

public class L6A2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employes you want to enter: ");
        int n=sc.nextInt();
        Employee [] emp=new Employee[n];
        for(int i=0;i<n;i++){
            emp[i]=new Employee();
        }
        for(int i=0;i<n;i++){
            emp[i].setData();
        }
        for(int i=0;i<n;i++){
            emp[i].getData();
        }
        sc.close();
    }
   
  
}
class Employee{
    Scanner sc=new Scanner(System.in);
    String Name;
    String Designation;
    int Salary;

     public void setData()
    {
        System.out.println("Enter Name: ");
        this.Name=sc.nextLine();
        System.out.println("Enter Designation: ");
        this.Designation=sc.nextLine();
        System.out.println("Enter Salary: ");
        this.Salary=sc.nextInt();
        sc.nextLine();
    }
    public void getData(){
        System.out.println("name: "+this.Name);
        System.out.println("Designation: "+this.Designation);
        System.out.println("Sallary: "+this.Salary);
    }

}  
