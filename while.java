import java.util.*;
public class wh{
public static void main(String ar[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i=0;
    while(i<10){
        int ans = n*(i+1);
        System.out.println(n + " * " + (i+1) +" = " + ans);
    }
    s.close();
} 
}