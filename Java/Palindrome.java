import java.util.*;

class Palindrome{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // built-in method
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        // manual 
        boolean isPalindrome = true;
        for(int i=0; i<str.length(); i++){
            

        
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    
        
        sc.close();
    }
}