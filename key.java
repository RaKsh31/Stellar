import java.util.*;

public class key {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Size = ");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("val " + (i + 1) + " = ");
            a[i] = s.nextInt();
        }
        System.out.print("key = ");
        int key = s.nextInt();
        int index;
        for (int j = 0; j < n; j++) {
            if (a[j] == key) {
                index = j;
                System.out.println("Index is " + index);
            }
            /*
             * else {
             * System.out.println("Key not found.");
             * }
             */
        }

        s.close();
    }
}