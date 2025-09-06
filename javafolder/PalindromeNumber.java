import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0, n = num;

        
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if (rev == num) System.out.println(num + " is Palindrome");
        else System.out.println(num + " is Not Palindrome");

        sc.close();
    }
}
