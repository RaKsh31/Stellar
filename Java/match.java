import java.util.*;

class match {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Boolean boo = false;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i) || str1.charAt(i) == '?' || str2.charAt(i) == '?'){
                boo = true;
            } else {
                boo = false;
                break;
            }
           // return boo;
        }
        if(boo){
            System.out.println("Yes matched !");
        } else {
            System.out.println("No !");
        }
        sc.close();
    }
}