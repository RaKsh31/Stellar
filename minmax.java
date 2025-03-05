import java.util.*;

public class minmax {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Size = ");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("val " + (i + 1) + " = ");
            a[i] = s.nextInt();
        }
        int min = a[0];
        int max = a[n - 1];
        for (int j = 0; j < n; j++) {
            if (a[0] >= a[j]) {
                min = a[j];
                max = a[j + 1];
            }
        }
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
        s.close();
    }
}