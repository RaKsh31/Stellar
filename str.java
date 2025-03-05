import java.util.*;

public class str {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        char arr[] = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + arr[i];
        }
        System.out.print(r);

    }
}