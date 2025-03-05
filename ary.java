import java.util.Scanner;

public class ary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        // int m = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("val " + (i + 1) + "= ");
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            sum = sum + arr[j];
            System.out.print(arr[j] + " ");
            System.out.println(" ");
        }
        sc.close();
        System.out.println("Sum = " + sum);
    }
}
