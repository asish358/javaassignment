import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num, sum = 0;

       
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if (sum == num) System.out.println(num + " is Armstrong");
        else System.out.println(num + " is Not Armstrong");

        sc.close();
    }
}
