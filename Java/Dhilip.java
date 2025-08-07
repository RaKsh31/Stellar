/* 
 * Dhilip goes to watch CSK match that's played after 2 years. He stands in a long queue & buys ticket. 
 * He believes that if the ticket as alternate sequence of same 2 letters then CSK will definitely win.
 * Else CSK will loose the match.
 * I/P : ababab      abtd
 * O/P :  YES         NO
 */
import java.util.*;

class Dhilip{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
             ch[i] = str.charAt(i);
    }
    if (str.length() < 2) {
            System.out.println("NO");
        }
    char k = ch[0];
    char j = ch[1]; 
    boolean isAlternate = true;
    if(k == j){
        isAlternate = false;
    }
    else{
    for(int i = 2; i < str.length(); i++){
        if(i % 2 == 0 && str.charAt(i) != k){
            isAlternate = false;
            break;
        }
        if(i % 2 == 1 && str.charAt(i) != j){
            isAlternate = false;
            break;
        }
    }
}
    if(isAlternate) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }

sc.close();
    }
}
