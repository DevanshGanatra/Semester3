public class L1C4 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000 are: ");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;
        // Calculate the number of digits
        int temp = originalNumber;
        while (temp != 0) {
            temp /= 10;
            n++;
        }
        temp = originalNumber;
        // Calculate the sum of the nth power of each digit
        while (temp != 0) {
            remainder = temp % 10;
            result += Math.pow(remainder, n);
            temp /= 10;
        }
        // Check if the number is an Armstrong number
        return result == number;
    }
}
//output
/*Armstrong numbers between 1 and 1000 are: 
1
2
3
4
5
6
7
8
9
153
370
371
407
 */
