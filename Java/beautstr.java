import java.util.*;

public class beautstr{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String max = "0";
    /*
    Char arr[] = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = str.charAt(i);
        }
    */
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a'){
                int j=i, a=0, e=0, ic=0, o=0, u=0;
                while(j<n && "aeiou".indexOf(str.charAt(j)) != -1){
                    char c = str.charAt(j);
                    if (c == 'a' && e+ic+o+u == 0) a++;
                    else if (c == 'e' && a > 0 && ic+o+u == 0) e++;
			else if (c == 'i' && a+e > 0 && o+u == 0) ic++;
			else if (c == 'o' && a+e+ic > 0 && u == 0) o++;
			else if (c == 'u' && a+e+ic+o > 0) u++;
            else break;
                    // check if all vowels are present
                    if (a > 0 && e > 0 && ic > 0 && o > 0 && u > 0) {
                        if (j-i+1 > max.length()) 
                            max = str.substring(i, j+1);
                    }
                    j++;
                }
            }
        }
        String res = max.equals("0") ? "0" : max;
        System.out.println(res);
        sc.close();
}
}