import java.util.Scanner;

public class SimpleKaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println(num + " is a Kaprekar number.");
            return;
        }

        int square = num * num;
        int divisor = 10;

        while (divisor <= square) {
            int right = square % divisor;
            int left = square / divisor;

            if (right > 0 && (left + right) == num) {
                System.out.println(num + " is a Kaprekar number.");
                return;
            }

            divisor *= 10;
        }

        System.out.println(num + " is NOT a Kaprekar number.");
    }
}
