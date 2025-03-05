import java.util.*;
public class pat{
public static void main(String ar[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    
   for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("@ ");
    }
    System.out.println();
   }
   // reverse triangle
   int m = s.nextInt();
   for(int i=m;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("# ");
    }
    System.out.println();
   }
    s.close();
} 
}
