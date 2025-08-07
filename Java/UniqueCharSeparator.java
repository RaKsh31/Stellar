import java.util.Scanner;

public class UniqueCharSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // To store first occurrence of alphabets
        char[] alphaSeen = new char[26];
        int alphaIndex = 0;

        // To store last occurrence of digits (we'll overwrite)
        char[] digitLast = new char[10];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Handle alphabets (a-z)
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                boolean alreadyAdded = false;

                // Check if already in alphaSeen
                for (int j = 0; j < alphaIndex; j++) {
                    if (alphaSeen[j] == ch) {
                        alreadyAdded = true;
                        break;
                    }
                }

                // Add if not found
                if (!alreadyAdded) {
                    alphaSeen[alphaIndex++] = ch;
                }
            }

            // Handle digits (0-9)
            else if (ch >= '0' && ch <= '9') {
                int idx = ch - '0';
                digitLast[idx] = ch; // always overwrite with latest
            }
        }

        // Print first occurrence alphabets
        for (int i = 0; i < alphaIndex; i++) {
            System.out.print(alphaSeen[i]);
        }

        // Print last occurrence digits in order of 0-9
        for (int i = 0; i < 10; i++) {
            if (digitLast[i] != 0) {
                System.out.print(digitLast[i]);
            }
        }

        System.out.println(); 
    }
}
