import java.util.*;
public class htpat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n / 2;

        // Top half
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < n; j++) {
                if (j == mid - i || j == mid + i) {
                    System.out.print("1");
                } else if (j > mid - i && j < mid + i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Bottom half
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j == mid - i || j == mid + i) {
                    System.out.print("1 ");
                } else if (j > mid - i && j < mid + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

    

