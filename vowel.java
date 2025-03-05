import java.util.*;

public class vowel {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int n = st.length();
        char a[] = new char[n];
        for (int i = 0; i < (n); i++) {
            a[i] = st.charAt((i));
            if (a[i] == 'a' || a[i] == 'A' || a[i] == 'e' || a[i] == 'E' || a[i] == 'i' || a[i] == 'I' || a[i] == 'o'
                    || a[i] == 'O' || a[i] == 'u' || a[i] == 'U') {
                System.out.println(a[i] + " is a Vowel.");
            } else {
                System.out.println(a[i] + " - Not a vowel.");
            }
        }
        s.close();
    }
}