package package1;
import java.util.Scanner;

public class ReverseIntegerApp 
{

    public static int reverse(int x) 
    {
        int rev = 0;

        while (x != 0) 
        {
            int digit = x % 10;

            // Check for overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
            {
                System.out.println("⚠️ Overflow detected. Returning 0.");
                return 0;
            }

            rev = rev * 10 + digit;
            x = x / 10;
        }

        return rev;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int input = scanner.nextInt();

        int result = reverse(input);
        System.out.println("Reversed integer: " + result);
    }
}