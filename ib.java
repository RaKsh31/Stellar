import java.util.*;
public class ib{
    public static void main(String ar[]){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int pa = 50;
        if(m >= pa){
            System.out.println("PASS");
            if(m >= 70)
              System.out.println("Above 70");
            if(m == 100)
             System.out.println("Distinction");
        }
        else
         System.out.println("FAIL");
        s.close();
    }
}