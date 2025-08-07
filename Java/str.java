import java.util.*;
public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int ones = 2;
            int stars = (i - 1) * 2;
            // Print 1's
            for(int j = 0; j < ones; j++) {
                System.out.print("1 ");
            }
            // Print *'s
            for(int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
