import java.util.*;
public class L5B1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Game!!");
        System.out.println("Halo Darshan ni Game Rami :-( ");
        System.out.println("Enter No. of words you want:");
        int size=sc.nextInt();
        sc.nextLine();
        String [] arr=new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter word-"+(i+1)+": ");
            arr[i]=sc.nextLine();
        }
        int n=(int)Math.floor(Math.random()*size);
        System.out.println("Your word is -- "+arr[n]+" --");
        System.out.println("Enter any other word (Jumbelled word):");
        String str=sc.nextLine();
        char ch1[]=arr[n].toLowerCase().toCharArray();
        char ch2[]=str.toLowerCase().toCharArray();
        if(ch1.length != ch2.length){
            System.out.println("tumshe naa ho payega ! :-)");
        }
        else{
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean isNotAnagram=false;
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]!=ch2[i]){
                    System.out.println("tumshe naa ho payega ! :-)");
                    isNotAnagram=true;
                    break;
                }
            }
            if(!isNotAnagram)
            {
                System.out.println("You Won this Game!! , You achived something :-)");
            }
        }
        sc.close();
    }
}
