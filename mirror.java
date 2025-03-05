import java.util.*;

public class mirror {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int j = 1; j < (n + 1); j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("@ ");
            }
            for (int l = 0; l < ((n - (j - 1)) * 2); l++) {
                System.out.print("  ");
            }
            for (int m = 0; m < j; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}