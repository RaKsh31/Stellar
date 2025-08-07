import java.util.*;

class NoSpl{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string - ");
        String str = sc.nextLine();
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) || ch == ' ' || ch == '.') {
                res += ch;
            }
        }
        System.out.println(res);
    }
}