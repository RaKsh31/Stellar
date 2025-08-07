import java.util.*;
import java.lang;
public class nameno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0, res;
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                sum += Character.toUpperCase(ch) - 'A' + 1;
            }
        }
        while (sum >= 10){
            res=0;
            while(sum > 0){
                res = res + sum % 10;
                sum /= 10;
            }
            sum = res;
        }
        System.out.println("Lucky num = " + sum );
    }
}