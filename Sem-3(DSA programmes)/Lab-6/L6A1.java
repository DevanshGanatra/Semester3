import java.util.Scanner;

public class L6A1 {
    public static void Swap(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no-1: ");
        int a = sc.nextInt();
        System.out.println("Enter no-2: ");
        int b = sc.nextInt();
        int[] numbers = {a, b};
        System.out.println("Before");
        System.out.println("a=" + numbers[0] + " and b=" + numbers[1]);
        Swap(numbers);
        System.out.println("After");
        System.out.println("a=" + numbers[0] + " and b=" + numbers[1]);
        sc.close();
    }
}
