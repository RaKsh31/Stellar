import java.util.*;

public class zero {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 0) {
            System.out.println("It's a zero.");
        } else if (n < 0) {
            System.out.println("It's negative.");
        } else {
            while (n > 0) {
                int digit = n % 10;
                if (digit == 0) {
                    ;
                }
                n /= 10;
            }
            System.out.println("Zero is present.");
        }
        s.close();
    }
}