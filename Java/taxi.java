import java.util.*;

public class taxi{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("R1 = ");
        int R1 = sc.nextInt();
        System.out.print("R2 = ");
        int R2 = sc.nextInt();
        System.out.print("X (hrs) = ");
        int X = sc.nextInt();
        System.out.print("N (mins) = ");
        int N = sc.nextInt();
        int first = X*R1;
        int time = N/60;
        int hr = time - X;
        int sec = hr*R2;
        int cost = first + sec;
        sc.close();
        System.out.println("Total fair = " + cost);
    }
}