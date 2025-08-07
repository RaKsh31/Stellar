import java.util.Scanner;

public class Occurence {

    public int count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get string input
        String inputString = scanner.nextLine();

        // Get character input
        char inputChar = scanner.nextLine().charAt(0);

        Occurence occurenceObj = new Occurence();
        int result = occurenceObj.count(inputString, inputChar);

        System.out.println(result);

        scanner.close();
    }
}