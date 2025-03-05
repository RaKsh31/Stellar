import java.util.*;

public class ar2 {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Size = ");
        int n = s.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("val " + i + " " + j + " = ");
                a[i][j] = s.nextInt();
            }
        }
        for (int k = 0; k < n; k++) {
            for (int r = 0; r < n; r++) {
                System.out.print(a[k][r] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}