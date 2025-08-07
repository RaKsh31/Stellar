import java.util.*;

class CaseChange{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        /* 
        // With built-in methods

        System.out.print("Enter a string in lowercase:");
        String lStr = sc.nextLine();
        String str = lStr.toUpperCase();
        System.out.println("String in uppercase: " + str);
        System.out.print("Enter a string in uppercase:");
        String uStr = sc.nextLine();
        String res = uStr.toLowerCase();
        System.out.println("String in lowercase: " + res);
        */

        // Without built-in methods

        System.out.print("Enter String - ");
        String ss = sc.nextLine();
        int n = ss.length();
        for(int i=0; i<n; i++){
            char ch = ss.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                System.out.print((char)(ch - 32));
            } else if(ch >= 'A' && ch <= 'Z'){
                System.out.print((char)(ch + 32));
            } else {
                System.out.print(ch); // Print non-alphabetic characters as is
            }
        }
        sc.close();
    }
}