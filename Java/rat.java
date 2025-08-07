import java.util.*;

public class rat{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int food = r*unit;
        int sum = 0, num = 0;
        for(int i=0; i<n; i++){
            if(sum<=food){
                sum += ar[i];
                num = num+1;
            }
            else
                break;
        }
        System.out.println(num + " houses are needed.");
        sc.close();
    }
}

