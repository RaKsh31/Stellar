import java.util.*;

public class lp {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("No. for for loop is ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " " + "Heloo");
        }
        System.out.print("Enter no. to print tables -> ");
        int m = s.nextInt();
        for (int j = 0; j < 10; j++) {
            int ans = m * (j + 1);
            System.out.println(m + " * " + (j + 1) + " = " + ans);
        }
        s.close();
    }
}
